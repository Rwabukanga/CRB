package com.CRBProjectt.CRBProjectt.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerGender;
import com.CRBProjectt.CRBProjectt.Service.GenderService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Gender;


@Controller
@CrossOrigin
@RequestMapping(value="/gender")
public class GenderController {

	@Autowired
	private GenderService genderservice;
	
	

	@CrossOrigin
	@RequestMapping(value="/savegender", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerGender gender){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  Gender c = new Gender();
			
			   c.setName(gender.getName());
			
			   genderservice.createGender(c);
			
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
