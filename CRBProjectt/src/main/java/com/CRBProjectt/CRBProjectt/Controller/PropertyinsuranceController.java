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
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerPropertyinsurance;
import com.CRBProjectt.CRBProjectt.Service.PropertyinsuranceService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.Claimtypes;
import com.CRBProjectt.CRBProjectt.domain.Propertyinsurance;

@RestController
@CrossOrigin
@RequestMapping(value="")
public class PropertyinsuranceController {
	
	@Autowired
	private PropertyinsuranceService piservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/propertyinsurance", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createPropertyinsurance(HttpServletRequest request, @RequestBody InnerPropertyinsurance innprop){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			Propertyinsurance prop = new Propertyinsurance();
			
			prop.setAmountofclaimreserve(innprop.getAmountofclaimreserve());
			prop.setAmountpaid(innprop.getAmountpaid());
			prop.setClaimdeclarationdate(innprop.getClaimdeclarationdate());
			prop.setClaimnumber(innprop.getClaimnumber());
			prop.setClaimsettlementdate(innprop.getClaimsettlementdate());
			prop.setClaimstatus(ClaimStatus.Pending);
			prop.setClaimtype(Claimtypes.GroupPersonalAccident);
			prop.setDamagesdescription(innprop.getDamagesdescription());
			prop.setIncidentdate(innprop.getIncidentdate());
			prop.setIncidentdescription(innprop.getIncidentdescription());
			prop.setPlaceofincident(innprop.getPlaceofincident());
			prop.setPolicynumber(innprop.getPolicynumber());
			prop.setRejectionreason(innprop.getRejectionreason());
			
			    piservice.createPropertyinsurance(prop);
			    rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(prop);	
				
		}catch(ResourceNotFoundException ex) {
			
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
	}
	
	
	

}
