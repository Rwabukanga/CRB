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
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerMobile;
import com.CRBProjectt.CRBProjectt.Service.GenderService;
import com.CRBProjectt.CRBProjectt.Service.MobileService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Gender;
import com.CRBProjectt.CRBProjectt.domain.Mobile;

@RestController
@CrossOrigin
@RequestMapping(value="/data/rw")
public class MobileController {
	
	@Autowired
	private MobileService mobservice;
	
	@Autowired
	private GenderService gdservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/mobile", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerMobile mob){
		
		ResponseBean rb = new ResponseBean();
		Gender gender = null;
		try {
			
			Optional<Gender> gend =gdservice.findByid(mob.getGenderid());
			if(gend.isPresent()) {
				gender = gend.get();
				Mobile mm =new Mobile();
				  mm.setAccountProductType(mob.getAccountProductType());
				  mm.setAccountStatus(mob.getAccountStatus());
				  mm.setClassification(mob.getClassification());
				  mm.setCurrency(mob.getCurrency());
				  mm.setCustomerRef(mob.getCustomerRef());
				  mm.setDateClosed(mob.getDateClosed());
				  mm.setDaysInArrears(mob.getDaysInArrears());
				  mm.setDisbursementDate(mob.getDisbursementDate());
				  mm.setDob(mob.getDob());
				  mm.setDocumentNumber(mob.getDocumentNumber());
				  mm.setDocumentType(mob.getDocumentType());
				  mm.setForeName1(mob.getForeName1());
				  mm.setForeName2(mob.getForeName2());
				  mm.setForeName3(mob.getForeName3());
				  mm.setGenderid(gender);
				  mm.setLastPaymentDate(mob.getLastPaymentDate());
				  mm.setLoanAccount(mob.getLoanAccount());
				  mm.setLoanBalance(mob.getLoanBalance());
				  mm.setMaturityDate(mob.getMaturityDate());
				  mm.setMobileNumber(mob.getMobileNumber());
				  mm.setPrincipalAmount(mob.getPrincipalAmount());
				  mm.setSurName(mob.getSurName());
				  
				  mobservice.createMobile(mm);
				  rb.setCode(Messages.SUCCESS_CODE);
				  rb.setDescription(Messages.save);
				  rb.setObject(mm);
			}
			  
			
			   	
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}

}
