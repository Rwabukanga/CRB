package com.CRBProjectt.CRBProjectt.Controller;

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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerCountry;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Country;

@RestController  
@CrossOrigin
@RequestMapping(value="/country")
public class CountryController {
	
	@Autowired
	private CountryService countryservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/savecountry", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerCountry country){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  Country c = new Country();
			
			    c.setName(country.getName());
			
			    countryservice.createCountry(c);
			
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(c);	
				

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
	

}
