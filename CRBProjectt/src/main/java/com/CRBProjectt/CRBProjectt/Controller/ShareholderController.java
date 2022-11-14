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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerShareholder;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Service.ShareholderService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.Shareholder;
import com.CRBProjectt.CRBProjectt.domain.ShareholderTypes;

@RestController
@CrossOrigin
@RequestMapping(value="/")
public class ShareholderController {
	
	
	@Autowired
	private ShareholderService shareservice;
	
	@Autowired
	private CountryService countryservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="update/shareholder", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerShareholder hold){
		
		ResponseBean rb = new ResponseBean();
		Country country= null;
		try {
			Shareholder c = new Shareholder();
			
			  Optional<Country> cc = countryservice.findByid(hold.getCountryid());
			  
			  if(cc.isPresent()) {
				  country = cc.get();
				  
				  c.setSurname(hold.getSurname());
				  c.setPercentageofshares(hold.getPercentageofshares());
				  c.setNumberofshares(hold.getNumberofshares());
				  
				  if(ShareholderTypes.INDIVIDUAL != null) {
					  c.setSurname(hold.getSurname());
					  c.setForename1(hold.getForename1());
					  c.setForename2(hold.getForename2());
					  c.setForename3(hold.getForename3());
					  c.setNationalid(hold.getNationalid());
					  c.setPassportno(hold.getPassportno());
					  c.setNationality(hold.getNationality());
					  c.setDatofbirth(hold.getDatofbirth());
					  c.setPlaceofbirth(hold.getPlaceofbirth());
					  c.setPostaladdressline1number(hold.getPostaladdressline1number());
					  c.setPostaladdressline1postalcode(hold.getPostaladdressline1postalcode());
					  c.setCountryid(country);
				  }else if (ShareholderTypes.CORPORATE != null) {
					  c.setInstitutionname(hold.getInstitutionname());
					  c.setTradingname(hold.getTradingname());
					  c.setCompanyregno(hold.getCompanyregno());
					  c.setCompanyregistrationdate(hold.getCompanyregistrationdate());
					  c.setPostaladdressline1number(hold.getPostaladdressline1number());
					  c.setPostaladdressline1postalcode(hold.getPostaladdressline1postalcode());
					  c.setTown(hold.getTown());
					  c.setCountryid(country);
				  }else {
					  System.out.println("Nothing Else");
				  }
				  
				    shareservice.createShareholder(c);
					rb.setCode(Messages.SUCCESS_CODE);
					rb.setDescription(Messages.save);
					rb.setObject(c);	
			  }
			  
			  
			 

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
