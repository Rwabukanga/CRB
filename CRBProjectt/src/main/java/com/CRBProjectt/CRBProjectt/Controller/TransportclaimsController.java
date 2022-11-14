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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnnerTransportclaims;
import com.CRBProjectt.CRBProjectt.Service.TransportclaimsService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.PolicyCover;
import com.CRBProjectt.CRBProjectt.domain.Transportclaims;


@RestController
@CrossOrigin
@RequestMapping(value="")
public class TransportclaimsController {
	
	@Autowired
	private TransportclaimsService trservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/update/transportclaim", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createTransportclaims(HttpServletRequest request, @RequestBody InnnerTransportclaims trc){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			Transportclaims tr = new Transportclaims();
			
			tr.setAmountofclaimreserve(trc.getAmountofclaimreserve());
			tr.setAmountpaid(trc.getAmountpaid());
			tr.setClaimdeclarationdate(trc.getClaimdeclarationdate());
			tr.setClaimnumber(trc.getClaimnumber());
		    tr.setClaimsettlementdate(trc.getClaimsettlementdate());
			tr.setClaimstatus(ClaimStatus.Pending);
			tr.setDamagesdescription(trc.getDamagesdescription());
			tr.setDateofpaymentoflastpremium(trc.getDateofpaymentoflastpremium());
			tr.setDescriptionofgoods(trc.getDescriptionofgoods());
			tr.setIncidentdate(trc.getIncidentdate());
			tr.setLossadjuster(trc.getLossadjuster());
			tr.setLossAdjusternumber(trc.getLossadjuster());
			tr.setPlaceofincident(trc.getPlaceofincident());
			tr.setPolicycover(PolicyCover.Bid_bond);
			tr.setPolicynumber(trc.getPolicynumber());
			tr.setRejectionreason(trc.getRejectionreason());
			
			trservice.createTransportclaims(tr);
			
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(tr);
			    
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
