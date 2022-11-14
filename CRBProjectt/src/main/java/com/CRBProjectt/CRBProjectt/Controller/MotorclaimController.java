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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerMotorclaim;
import com.CRBProjectt.CRBProjectt.Service.MotorclaimService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.Motorclaim;
import com.CRBProjectt.CRBProjectt.domain.PolicyCover;
import com.CRBProjectt.CRBProjectt.domain.Trailer;

@RestController
@CrossOrigin
@RequestMapping(value="")
public class MotorclaimController {
	
	@Autowired
	private MotorclaimService mservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/update/motorclaim", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerMotorclaim claim){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			Motorclaim cl = new Motorclaim();
			
			cl.setYearofmanufacture(claim.getYearofmanufacture());
			
			if(claim.getYearofmanufacture().length()>4) {
				cl.setYearofmanufacture(claim.getYearofmanufacture());
			}else {
				System.out.println("large than 4 digits");
			}
			
			cl.setAmountofclaimreserve(claim.getAmountofclaimreserve());
			cl.setAmountpaid(claim.getAmountpaid());
			cl.setAssessorsidnumber(claim.getAssessorsidnumber());
			cl.setClaimdeclarationdate(claim.getClaimdeclarationdate());
			cl.setClaimnumber(claim.getClaimnumber());
			cl.setClaimsettlementdate(claim.getClaimsettlementdate());
			cl.setClaimstatus(ClaimStatus.Pending);
			cl.setDateofpaymentoflastpremium(claim.getDateofpaymentoflastpremium());
			cl.setDrivinglicensenumber(claim.getDrivinglicensenumber());
			cl.setFirstnameofthedriver(claim.getFirstnameofthedriver());
			cl.setIdentificationdocumentnumberfordriver(claim.getIdentificationdocumentnumberfordriver());
			cl.setIdtype(IdentificationdocumentType.National_ID);
			cl.setIncidentdate(claim.getIncidentdate());
			cl.setNameofassessor(claim.getNameofassessor());
			cl.setNameofpoliceofficer(claim.getNameofpoliceofficer());
			cl.setNameofpolicestation(claim.getNameofpolicestation());
			cl.setNumberofpersonsinvolved(claim.getNumberofpersonsinvolved());
			cl.setPlaceofincident(claim.getPlaceofincident());
			cl.setPolicycover(PolicyCover.Customs_Bond);
			cl.setPolicynumber(claim.getPolicynumber());
			cl.setRejectionreason(claim.getRejectionreason());
			cl.setSurnameofdriver(claim.getRejectionreason());
			cl.setTrailer(Trailer.Personal);
			cl.setTrailerregistrationnumber(claim.getTrailerregistrationnumber());
			cl.setVehiclechassisnumber(claim.getVehiclechassisnumber());
			
			mservice.createMotorclaim(cl);
			
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(cl);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
