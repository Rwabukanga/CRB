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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerCorporalAccidentClaim;
import com.CRBProjectt.CRBProjectt.Service.CorporalAccidentClaimService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.Claimtypes;
import com.CRBProjectt.CRBProjectt.domain.CorporalAccidentClaim;


@RestController
@CrossOrigin
@RequestMapping(value="")
public class CorporalAccidentClaimController {
	
	@Autowired
	private CorporalAccidentClaimService corporalservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/corporalaccidentclaim", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerCorporalAccidentClaim corporal){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			CorporalAccidentClaim corp = new CorporalAccidentClaim();
			
			corp.setAmountOfClaimReserve(corporal.getAmountOfClaimReserve());
			corp.setAmountPaid(corporal.getAmountPaid());
			corp.setClaimDeclarationDate(corporal.getClaimDeclarationDate());
			corp.setClaimNumber(corporal.getClaimNumber());
			corp.setClaimSettlementDate(corporal.getClaimSettlementDate());
			corp.setClaimStatus(ClaimStatus.Pending);
			corp.setClaimType(Claimtypes.GroupPersonalAccident);
			corp.setIncidentDate(corporal.getIncidentDate());
			corp.setIncidentDescription(corporal.getIncidentDescription());
			corp.setInjuriesDescription(corporal.getInjuriesDescription());
			corp.setPlaceOfIncident(corporal.getPlaceOfIncident());
			corp.setPolicyNumber(corporal.getPolicyNumber());
			corp.setRejectionReason(corporal.getRejectionReason());
			
			corporalservice.createCorporal(corp);
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(corp);
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
