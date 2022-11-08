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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerCoporateCredit;
import com.CRBProjectt.CRBProjectt.Service.CorporateCreditService;
import com.CRBProjectt.CRBProjectt.Service.SectorService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.AccountRepaymentTerm;
import com.CRBProjectt.CRBProjectt.domain.CorporateCredit;
import com.CRBProjectt.CRBProjectt.domain.Sector;

@RestController
@CrossOrigin
@RequestMapping(value="/data/rw")
public class CorporateCreditController {
	
	
	@Autowired
	private CorporateCreditService corpservice;
	
	@Autowired
	private SectorService sectorservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/update/corporatecredit", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerCoporateCredit corporate){
		
		ResponseBean rb = new ResponseBean();
		Sector sector = null;
		try {
			
			Optional<Sector> sc = sectorservice.findByid(corporate.getSectorid());
			
			if(sc.isPresent()) {
				sector = sc.get();
				CorporateCredit corp = new CorporateCredit();
				corp.setAccountNumber(corporate.getAccountNumber());
				corp.setAccountOwner(corporate.getAccountOwner());
				corp.setAccountRepaymentTerm(AccountRepaymentTerm.Daily);
				corp.setAccountStatus(corporate.getAccountStatus());
				corp.setAccountType(corporate.getAccountType());
				corp.setActualPaymentAmount(corporate.getActualPaymentAmount());
				corp.setAmountPastDue(corporate.getAmountPastDue());
				corp.setApprovalDate(corporate.getApprovalDate());
				corp.setAvailableCredit(corporate.getAvailableCredit());
				corp.setCategory(corporate.getCategory());
				corp.setClassification(corporate.getClassification());
				corp.setCompanyCeaseDate(corporate.getCompanyCeaseDate());
				corp.setCompanyRegistrationDate(corporate.getCompanyRegistrationDate());
				corp.setCompanyRegNo(corporate.getCompanyRegNo());
				corp.setCurrencyType(corporate.getCurrencyType());
				corp.setCurrentBalance(corporate.getCurrentBalance());
				corp.setCurrentBalanceIndicator(corporate.getCurrentBalanceIndicator());
				corp.setDateAccountOpened(corporate.getDateAccountOpened());
				corp.setDateAccountUpdated(corporate.getDateAccountUpdated());
				corp.setDateClosed(corporate.getDateClosed());
				corp.setDaysInArrears(corporate.getDaysInArrears());
				corp.setEmailAddress(corporate.getEmailAddress());
				corp.setFacsimile1(corporate.getFacsimile1());
				corp.setFacsimile2(corporate.getFacsimile2());
				corp.setFinalPaymentDate(corporate.getFinalPaymentDate());
				corp.setFirstPaymentDate(corporate.getFirstPaymentDate());
				corp.setIndustry(corporate.getIndustry());
				corp.setInstallmentsInArrears(corporate.getInstallmentsInArrears());
				corp.setInstitution(corporate.getInstitution());
				corp.setInterestRateAtDisbursement(corporate.getInterestRateAtDisbursement());
				corp.setLastPaymentDate(corporate.getLastPaymentDate());
				corp.setNature(corporate.getNature());
				corp.setNumberOfJointLoanParticipants(corporate.getNumberOfJointLoanParticipants());
				corp.setPhysicalAddressCell(corporate.getPhysicalAddressCell());
				corp.setOpeningBalance(corporate.getOpeningBalance());
				corp.setPhysicalAddressLine1(corporate.getPhysicalAddressLine1());
				corp.setPhysicalAddressLine2(corporate.getPhysicalAddressLine2());
				corp.setPhysicalAddressPlotNumber(corporate.getPhysicalAddressPlotNumber());
				corp.setPhysicalAddressPostalCode(corporate.getPhysicalAddressPostalCode());
				corp.setPhysicalAddressSector(sector);
				corp.setPostalAddressNumber(corporate.getPostalAddressNumber());
				corp.setPostalCode(corporate.getPostalCode());
				corp.setScheduledPaymentAmount(corporate.getScheduledPaymentAmount());
				corp.setSectorOfActivity(corporate.getSectorOfActivity());
				corp.setTaxNo(corporate.getTaxNo());
				corp.setTelephone1(corporate.getTelephone1());
				corp.setTelephone2(corporate.getTelephone2());
				corp.setTelephone3(corporate.getTelephone3());
				corp.setTelephone4(corporate.getTelephone4());
				corp.setTelephone5(corporate.getTelephone5());
				corp.setTelephone6(corporate.getTelephone6());
				corp.setTermsDuration(corporate.getTermsDuration());
				corp.setTradingName(corporate.getTradingName());
				corp.setVatNo(corporate.getVatNo());
				
				
				corpservice.createCorporateCredit(corp);
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(corp);	
			}else {
				rb.setCode(Messages.ERROR_CODE);
				rb.setDescription("fail to save");
			}
			 	
			

			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
	

}
