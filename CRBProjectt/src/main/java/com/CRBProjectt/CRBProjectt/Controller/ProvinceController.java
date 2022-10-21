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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerProvince;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Service.ProvinceService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.Province;

@RestController
@CrossOrigin
@RequestMapping(value="/province")
public class ProvinceController {
	
	@Autowired
	private ProvinceService provinceservice;
	
	@Autowired
	private CountryService countryservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/saveprovince", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerProvince province){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  Province c = new Province();
			
			  Optional<Country> cc = countryservice.findByid(province.getCountryid());
			  Country country = cc.get();
			  
			  c.setName(province.getName());
			  c.setCountryid(country);
			    
			  provinceservice.createProvince(c);
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
