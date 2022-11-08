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
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerDistrict;
import com.CRBProjectt.CRBProjectt.Service.DistrictService;
import com.CRBProjectt.CRBProjectt.Service.ProvinceService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.District;
import com.CRBProjectt.CRBProjectt.domain.Province;

@RestController
@CrossOrigin
@RequestMapping(value="/district")
public class DistrictController {
	
	@Autowired
	private DistrictService districtservice;
	
	@Autowired
	private ProvinceService provinceservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/savedistrict", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerDistrict district){
		
		ResponseBean rb = new ResponseBean();
		
		
			  Province c = null;
			
			  Optional<Province> p = provinceservice.findByid(district.getProvinceid());
			 
			 if(p.isPresent()) {
				 c = p.get();
				 District d = new District();
				  
				  d.setName(district.getName());
				  d.setProvinceid(c);
				  
				  districtservice.createDistrict(d);
				  
					rb.setCode(Messages.SUCCESS_CODE);
					rb.setDescription(Messages.save);
					rb.setObject(d);	
			 }else {
				 throw new ResourceNotFoundException("Province Not Found");
			 }
			  
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
	

}
