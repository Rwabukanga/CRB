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
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerPolicydetails;
import com.CRBProjectt.CRBProjectt.Service.PolicydetailsService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Classification;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.PolicyStatus;
import com.CRBProjectt.CRBProjectt.domain.Policydetails;
import com.CRBProjectt.CRBProjectt.domain.Policytype;
import com.CRBProjectt.CRBProjectt.domain.Salutation;

@RestController
@CrossOrigin
@RequestMapping("/data/rw")
public class PolicydetailsController {
	
	@Autowired
	private PolicydetailsService polservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/policydetails", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerPolicydetails pl){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			Policydetails pt = new Policydetails();
			pt.setBasePolicyNumber(pl.getBasePolicyNumber());
			pt.setBaseTransactionDate(pl.getBaseTransactionDate());
			pt.setClassification(Classification.WATCH);
			pt.setCurrency(pl.getCurrency());
			pt.setCustomerType(pl.getCustomerType());
			pt.setEndorsementDate(pl.getEndorsementDate());
			pt.setEndorsementNumber(pl.getEndorsementNumber());
			pt.setFirstName(pl.getFirstName());
			pt.setGrossPremiumAmount(pl.getGrossPremiumAmount());
			pt.setIdentification(IdentificationdocumentType.National_ID);
			pt.setIdentificationDocumentNumber(pl.getIdentificationDocumentNumber());
			pt.setInstitutionName(pl.getInstitutionName());
			pt.setInsuredAmount(pl.getInsuredAmount());
			pt.setMiddleName(pl.getMiddleName());
			pt.setNumberOfPersonsCovered(pl.getNumberOfPersonsCovered());
			pt.setOtherInformation(pl.getOtherInformation());
			pt.setPolicyExpiryDate(pl.getPolicyExpiryDate());
			pt.setPolicyStartDate(pl.getPolicyStartDate());
			pt.setPolicystatus(PolicyStatus.Pending_Approval);
			pt.setPolicytype(Policytype.Base);
			pt.setSalutation(Salutation.Advocate);
			pt.setSurName(pl.getSurName());
			pt.setTradingName(pl.getTradingName());
			
			
			    polservice.createPolicydetails(pt);
			    rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(pt);	
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}

}
