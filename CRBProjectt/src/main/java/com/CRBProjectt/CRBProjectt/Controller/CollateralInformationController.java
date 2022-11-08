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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerCollateralInformation;
import com.CRBProjectt.CRBProjectt.Service.CollateralInformationService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.CollateralInformation;


@RestController
@CrossOrigin
@RequestMapping(value="/data/rw")
public class CollateralInformationController {

	@Autowired
	private CollateralInformationService collservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/collateral", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCollateralInformation(HttpServletRequest request, @RequestBody InnerCollateralInformation coll){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			CollateralInformation colll = new CollateralInformation();
			colll.setAccountNumber(coll.getAccountNumber());
			colll.setCollateralExpiryDate(coll.getCollateralExpiryDate());
			colll.setCollateralLastValuationDate(coll.getCollateralLastValuationDate());
			colll.setCollateralType(coll.getCollateralType());
			colll.setCollateralValue(coll.getCollateralValue());
			
			rb.setCode(Messages.SUCCESS_CODE);
			rb.setDescription(Messages.save);
			rb.setObject(colll);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
}
