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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerLoan;
import com.CRBProjectt.CRBProjectt.Service.Tcl01ClientService;
import com.CRBProjectt.CRBProjectt.Service.Tln03LoanService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.CurrencyType;
import com.CRBProjectt.CRBProjectt.domain.Tcl01Client;
import com.CRBProjectt.CRBProjectt.domain.Tln03Loan;

@RestController
@CrossOrigin
@RequestMapping(value="/loan")
public class Tln03LoanController {

	
	@Autowired
	private Tcl01ClientService clientservice;
	
	@Autowired
	private Tln03LoanService loanservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/saveloan", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createEmployee(HttpServletRequest request, @RequestBody InnerLoan loan){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			Tcl01Client clientt=null;
			Optional<Tcl01Client> client = clientservice.findByid(loan.getClientid());
			if(client.isPresent()) {
				clientt=client.get();
			}
			Tln03Loan loann = new Tln03Loan();
			
			loann.setAccountnumber(loan.getAccountnumber());
			loann.setAccountowner(loan.getAccountowner());
			loann.setAccountRepaymentTerm(loan.getAccountRepaymentTerm());
			loann.setAccountStatus(loan.getAccountStatus());
			loann.setAccountType(loan.getAccountType());
			loann.setActualPaymentAmount(loan.getActualPaymentAmount());
			loann.setAmountPastDue(loan.getAmountPastDue());
			loann.setApprovalDate(loan.getApprovalDate());
			loann.setAvailableCredit(loan.getAvailableCredit());
			loann.setCategory(loan.getCategory());
			loann.setClassification(loan.getClassification());
			loann.setClientid(clientt);
			loann.setCurrencyType(CurrencyType.RWF);
			loann.setCurrentBalance(loan.getCurrentBalance());
			loann.setCurrentBalanceIndicator(loan.getCurrentBalanceIndicator());
			loann.setDateAccountOpened(loan.getDateAccountOpened());
			loann.setDateAccountUpdated(loan.getDateAccountUpdated());
			loann.setDateClosed(loan.getDateClosed());
			loann.setDaysInArrears(loan.getDaysInArrears());
			loann.setFacsimile(loan.getFacsimile());
			loann.setFinalPaymentDate(loan.getFinalPaymentDate());
			loann.setFirstPaymentDate(loan.getFirstPaymentDate());
			loann.setForeName1(loan.getForeName1());
			loann.setForeName2(loan.getForeName2());
			loann.setIncome(loan.getIncome());
			loann.setIncomeFrequency(loan.getIncomeFrequency());
			loann.setInstallmentsInArrears(loan.getInstallmentsInArrears());
			loann.setInterestRateAtDisbursement(loan.getInterestRateAtDisbursement());
			loann.setLastPaymentDate(loan.getLastPaymentDate());
			loann.setNature(loan.getNature());
			loann.setNoOfDependants(loan.getNoOfDependants());
			loann.setNumberOfJointLoanParticipants(loan.getNumberOfJointLoanParticipants());
			loann.setOccupation(loan.getOccupation());
			loann.setOldAccountNumber(loan.getOldAccountNumber());
			loann.setOpeningBalance(loan.getOpeningBalance());
			loann.setSalutation(loan.getSalutation());
			loann.setScheduledPaymentAmount(loan.getScheduledPaymentAmount());
			loann.setSectorOfActivity(loan.getSectorOfActivity());
			loann.setTaxNumber(loan.getTaxNumber());
			loann.setTermsDuration(loan.getTermsDuration());
			
			loanservice.createTln03Loan(loann);
			
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(loann);	
			
		}catch(Exception ex) {
	        
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
}
