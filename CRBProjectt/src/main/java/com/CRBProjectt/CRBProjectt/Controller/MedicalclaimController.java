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
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerMedicalclaim;
import com.CRBProjectt.CRBProjectt.Service.MedicalclaimService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Medicalclaim;

@RestController
@CrossOrigin
@RequestMapping(value="")
public class MedicalclaimController {
	
	@Autowired
	private MedicalclaimService  mdservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/medicalclaim", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerMedicalclaim claim){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			Medicalclaim cl = new Medicalclaim();
			cl.setAmountOfClaimReserve(claim.getAmountOfClaimReserve());
			cl.setAmountPaid(claim.getAmountPaid());
			cl.setClaimDeclarationDate(claim.getClaimDeclarationDate());
			cl.setClaimNumber(claim.getClaimNumber());
			cl.setClaimSettlementDate(claim.getClaimSettlementDate());
			cl.setClaimStatus(claim.getClaimStatus());
			cl.setIdentificationDocumentNumberOfServiceBeneficiary(claim.getIdentificationDocumentNumberOfServiceBeneficiary());
			cl.setIdentificationDocumentTypeOfServiceBeneficiary(claim.getIdentificationDocumentTypeOfServiceBeneficiary());
			cl.setPolicyNumber(claim.getPolicyNumber());
			cl.setRejectionReason(claim.getRejectionReason());
			cl.setServiceBeneficiaryName(claim.getServiceBeneficiaryName());
			cl.setServiceProviderAddress(claim.getServiceProviderAddress());
			cl.setServiceProviderName(claim.getServiceProviderName());
			cl.setServiceBeneficiarySurname(claim.getServiceBeneficiarySurname());
			cl.setServiceProviderType(claim.getServiceProviderType());
			
			mdservice.createMedicalclaim(cl);
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(cl);	
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}

}
