package com.CRBProjectt.CRBProjectt.Controller;

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

import com.CRBProjectt.CRBProjectt.Exeption.ResourceNotFoundException;
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerGuarantor;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Service.GuarantorService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.Guarantor;


@RestController
@CrossOrigin
@RequestMapping(value="/")
public class GuarantorController {

	
	@Autowired
	private GuarantorService guarantorservice;
	
	@Autowired
	private CountryService countryservice;
	
	
	@CrossOrigin
	@RequestMapping(value="update/guarantor", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerGuarantor guar){
		
		ResponseBean rb = new ResponseBean();
		Country country = null;
		try {
			Guarantor guarr = new Guarantor();
			Optional<Country> cou = countryservice.findByid(guar.getCountryid());
			if(cou.isPresent()) {
				country = cou.get();
				guarr.setAccountNumber(guar.getAccountNumber());
				guarr.setCompanyRegistrationDate(guar.getCompanyRegistrationDate());
				guarr.setCompanyRegNo(guar.getCompanyRegNo());
				guarr.setCountryid(country);
				guarr.setDateOfBirth(guar.getDateOfBirth());
				guarr.setForeName2(guar.getForeName2());
				guarr.setForeName3(guar.getForeName3());
				guarr.setGuarantorType(guar.getGuarantorType());
				guarr.setHomeTelephone(guar.getHomeTelephone());
				guarr.setInstitutionName(guar.getInstitutionName());
				guarr.setMobileTelephone(guar.getMobileTelephone());
				guarr.setNationalId(guar.getNationalId());
				guarr.setNationality(guar.getNationality());
				guarr.setPassportNumber(guar.getPassportNumber());
				guarr.setPlaceOfBirth(guar.getPlaceOfBirth());
				guarr.setPostalAddressNumber(guar.getPostalAddressNumber());
				guarr.setPostalCode(guar.getPostalCode());
				guarr.setSurName(guar.getSurName());
				guarr.setTelephone1(guar.getTelephone1());
				guarr.setTelephone2(guar.getTelephone2());
				guarr.setTelephone3(guar.getTelephone3());
				guarr.setTown(guar.getTown());
				guarr.setTradingName(guar.getTradingName());
				guarr.setWorkTelephone(guar.getWorkTelephone());
				
				guarantorservice.createGuarantor(guarr);
				
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(guarr);	
				
				
			}
	
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
	
	
}
