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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerbondsClaims;
import com.CRBProjectt.CRBProjectt.Service.bondsClaimsService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Bondsclaim;

@RestController
@CrossOrigin
@RequestMapping(value="")
public class bondsClaimsController {
	
	@Autowired
	private bondsClaimsService bondsservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/update/bondsclaim", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerbondsClaims bond){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			Bondsclaim bondd = new Bondsclaim();
			
			bondd.setAmountOfClaimReserve(bond.getAmountOfClaimReserve());
			bondd.setAmountPaid(bond.getAmountPaid());
			bondd.setBeneficiary(bond.getBeneficiary());
			bondd.setBeneficiaryAddress(bond.getBeneficiaryAddress());
			bondd.setBeneficiaryIdentificationDocumentNumber(bond.getBeneficiaryIdentificationDocumentNumber());
			bondd.setBeneficiaryIdentificationDocumentType(bond.getBeneficiaryIdentificationDocumentType());
			bondd.setClaimDeclarationDate(bond.getClaimDescription());
			bondd.setClaimDescription(bond.getClaimDescription());
			bondd.setClaimNumber(bond.getClaimSettlementDate());
			bondd.setClaimSettlementDate(bond.getClaimSettlementDate());
			bondd.setClaimStatus(bond.getClaimStatus());
			bondd.setPolicyCover(bond.getPolicyCover());
			bondd.setPolicyNumber(bond.getPolicyNumber());
			bondd.setRejectionReason(bond.getRejectionReason());
			bondd.setClaimSettlementDate(bond.getClaimSettlementDate());
			
			bondsservice.createBondsclaim(bondd);
			
				
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(bondd);
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
