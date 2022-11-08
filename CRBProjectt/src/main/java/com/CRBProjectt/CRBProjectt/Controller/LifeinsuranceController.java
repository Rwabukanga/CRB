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

import com.CRBProjectt.CRBProjectt.Exeption.ResourceNotFoundException;
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerLifeinsurance;
import com.CRBProjectt.CRBProjectt.Service.LifeinsuranceService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Classofinsurance;
import com.CRBProjectt.CRBProjectt.domain.Lifeinsurance;

@RestController
@CrossOrigin
@RequestMapping(value="/data/rw")
public class LifeinsuranceController {

	@Autowired
	private LifeinsuranceService lfservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/lifeinsurance", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerLifeinsurance lfi){
		
		ResponseBean rb = new ResponseBean();
		
		try {
		    Lifeinsurance lf= new Lifeinsurance();
		    lf.setAmountOfClaimReserve(lfi.getAmountOfClaimReserve());
		    lf.setAmountPaid(lfi.getAmountPaid());
		    lf.setBeneficiary(lfi.getBeneficiary());
		    lf.setBeneficiaryAddress(lfi.getBeneficiaryAddress());
		    lf.setClaimDeclarationDate(lfi.getClaimDeclarationDate());
		    lf.setClaimNumber(lfi.getClaimNumber());
		    lf.setClaimSettlementDate(lfi.getClaimSettlementDate());
		    lf.setClaimStatus(lfi.getClaimStatus());
		    lf.setClaimType(lfi.getClaimType());
		    lf.setClassOfInsurance(Classofinsurance.Pension_and_Savings);
		    lf.setIdentificationDocumentNumber(lfi.getIdentificationDocumentNumber());
		    lf.setIdentificationDocumentType(lfi.getIdentificationDocumentType());
		    lf.setIncidentDate(lfi.getIncidentDate());
		    lf.setPolicyNumber(lfi.getPolicyNumber());
		    lf.setRejectionReason(lfi.getRejectionReason());
		    lf.setClaimSettlementDate(lfi.getClaimDeclarationDate());
		    
		    lfservice.createLifeinsurance(lf);
		    rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(lf);	
			
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
}
