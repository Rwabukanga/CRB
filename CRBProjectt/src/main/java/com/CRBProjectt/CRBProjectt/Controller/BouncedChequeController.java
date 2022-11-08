package com.CRBProjectt.CRBProjectt.Controller;

import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CRBProjectt.CRBProjectt.Exeption.DOBException;
import com.CRBProjectt.CRBProjectt.Exeption.ErrorMessage;
import com.CRBProjectt.CRBProjectt.Exeption.NationalIdException;
import com.CRBProjectt.CRBProjectt.Exeption.ResourceNotFoundException;
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerBouncedCheque;
import com.CRBProjectt.CRBProjectt.Service.BouncedChequeService;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.BouncedCheque;
import com.CRBProjectt.CRBProjectt.domain.Country;

@RestController
@CrossOrigin
@RequestMapping(value="/data/rw")
public class BouncedChequeController {
	
	@Autowired
	private BouncedChequeService bhservice;
	
	@Autowired
	private CountryService countryservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/update/bouncedcheque", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createBouncedCheque(HttpServletRequest request, @RequestBody InnerBouncedCheque bch){
		
		ResponseBean rb = new ResponseBean();
		Country country =null;
		
//		try {
			Optional<Country> cc = countryservice.findByid(bch.getCountryid());
			
			if(cc.isPresent()) {
				country =cc.get();
				
				BouncedCheque bh = new BouncedCheque();
				bh.setAccountNumber(bch.getAccountNumber());
				bh.setAccountType(bch.getAccountType());
				bh.setBeneficiaryName(bch.getBeneficiaryName());
				bh.setChequeAmount(bch.getChequeAmount());
				bh.setChequeDate(bch.getChequeDate());
				bh.setChequeNumber(bch.getChequeNumber());
				bh.setCompanyRegistrationDate(bch.getCompanyRegistrationDate());
				bh.setCompanyRegNo(bch.getCompanyRegNo());
				bh.setCountryid(country);
				bh.setCurrency(bch.getCurrency());
				
				
				if(bch.getDateOfBirth().after(new Date())) {
					throw new DOBException("Invalid DOB");
				}else {
					bh.setDateOfBirth(bch.getDateOfBirth());
				}
				bh.setForeName1(bch.getForeName1());
				bh.setForeName2(bch.getForeName2());
				bh.setForeName3(bch.getForeName3());
				bh.setInstitutionName(bch.getInstitutionName());
				bh.setNationalId(bch.getNationalId());
				
				if(bch.getNationalId().length()==16) {
					bh.setNationalId(bch.getNationalId());
				}else {
					 throw new NationalIdException("Invalid National Id");
				}
				
				
				if(bch.getNationality().isEmpty()) {
					throw new ResourceNotFoundException("Invalid Nationality");
					
				}else {
					bh.setNationality(bch.getNationality());
				}
			
				bh.setPassportNumber(bch.getPassportNumber());
				bh.setPlaceOfBirth(bch.getPlaceOfBirth());
				bh.setPostalAddressNumber(bch.getPostalAddressNumber());
				bh.setPostalCode(bch.getPostalCode());
				bh.setReportedDate(bch.getReportedDate());
				bh.setReturnedChequeReason(bch.getReturnedChequeReason());
				bh.setSurName(bch.getSurName());
				bh.setTown(bch.getTown());
				bh.setTradingName(bch.getTradingName());
				
				bhservice.createBouncedCheque(bh);
				
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(bh);
				
			}	
			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//			rb.setCode(Messages.ERROR_CODE);
//			rb.setDescription("fail to save");
//		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
