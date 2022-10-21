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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerUser;
import com.CRBProjectt.CRBProjectt.Service.SystemUserService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.SystemUser;

@RestController
@CrossOrigin
@RequestMapping(value="/user")
public class SystemUserController {
	
	@Autowired
	private SystemUserService userservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/saveuser", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerUser user){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			  SystemUser  userr= new SystemUser();
			  userr.setFirstname(user.getFirstname());
			  userr.setLastname(user.getLastname());
			  userr.setUsername(user.getUsername());
			  userr.setPassword(user.getPassword());
			  
			  userservice.createUser(userr);
			
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(userr);	
				

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
