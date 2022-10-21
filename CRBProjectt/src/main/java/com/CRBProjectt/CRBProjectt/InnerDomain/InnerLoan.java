package com.CRBProjectt.CRBProjectt.InnerDomain;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.CurrencyType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerLoan {

    private String accountnumber;
	
	private String accountowner;
	
	private String accountRepaymentTerm;
	
	private String accountStatus;
	
	private String accountType;
	
	private String actualPaymentAmount;
	
	private double amountPastDue;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date approvalDate;
	
	private double availableCredit;
	
	private String category;
	
	private String classification;
	
	@Enumerated(EnumType.STRING)
	private CurrencyType CurrencyType;
	
	private double currentBalance;
	
	private String currentBalanceIndicator;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date dateAccountOpened;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date dateAccountUpdated;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date dateClosed;
	
	private String daysInArrears;
	
	private String facsimile;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date finalPaymentDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date firstPaymentDate;
	
	private String foreName1;
	
	private String foreName2;
	
	private double income;
	
	private double incomeFrequency;
	
	private String installmentsInArrears;
	
	private double interestRateAtDisbursement;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date lastPaymentDate;
	
	private String nature;
	
	private String noOfDependants;
	
	private String numberOfJointLoanParticipants;
	
	private String occupation;
	
	private String oldAccountNumber;
	
	private String openingBalance;
	
	private String salutation;
	
	private String scheduledPaymentAmount;
	
	private String sectorOfActivity;
	
	private String taxNumber;
	
	private String termsDuration;
	
	private int clientid;

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountowner() {
		return accountowner;
	}

	public void setAccountowner(String accountowner) {
		this.accountowner = accountowner;
	}

	public String getAccountRepaymentTerm() {
		return accountRepaymentTerm;
	}

	public void setAccountRepaymentTerm(String accountRepaymentTerm) {
		this.accountRepaymentTerm = accountRepaymentTerm;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getActualPaymentAmount() {
		return actualPaymentAmount;
	}

	public void setActualPaymentAmount(String actualPaymentAmount) {
		this.actualPaymentAmount = actualPaymentAmount;
	}

	public double getAmountPastDue() {
		return amountPastDue;
	}

	public void setAmountPastDue(double amountPastDue) {
		this.amountPastDue = amountPastDue;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public double getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(double availableCredit) {
		this.availableCredit = availableCredit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public CurrencyType getCurrencyType() {
		return CurrencyType;
	}

	public void setCurrencyType(CurrencyType currencyType) {
		CurrencyType = currencyType;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getCurrentBalanceIndicator() {
		return currentBalanceIndicator;
	}

	public void setCurrentBalanceIndicator(String currentBalanceIndicator) {
		this.currentBalanceIndicator = currentBalanceIndicator;
	}

	public Date getDateAccountOpened() {
		return dateAccountOpened;
	}

	public void setDateAccountOpened(Date dateAccountOpened) {
		this.dateAccountOpened = dateAccountOpened;
	}

	public Date getDateAccountUpdated() {
		return dateAccountUpdated;
	}

	public void setDateAccountUpdated(Date dateAccountUpdated) {
		this.dateAccountUpdated = dateAccountUpdated;
	}

	public Date getDateClosed() {
		return dateClosed;
	}

	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}

	public String getDaysInArrears() {
		return daysInArrears;
	}

	public void setDaysInArrears(String daysInArrears) {
		this.daysInArrears = daysInArrears;
	}

	public String getFacsimile() {
		return facsimile;
	}

	public void setFacsimile(String facsimile) {
		this.facsimile = facsimile;
	}

	public Date getFinalPaymentDate() {
		return finalPaymentDate;
	}

	public void setFinalPaymentDate(Date finalPaymentDate) {
		this.finalPaymentDate = finalPaymentDate;
	}

	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public String getForeName1() {
		return foreName1;
	}

	public void setForeName1(String foreName1) {
		this.foreName1 = foreName1;
	}

	public String getForeName2() {
		return foreName2;
	}

	public void setForeName2(String foreName2) {
		this.foreName2 = foreName2;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getIncomeFrequency() {
		return incomeFrequency;
	}

	public void setIncomeFrequency(double incomeFrequency) {
		this.incomeFrequency = incomeFrequency;
	}

	public String getInstallmentsInArrears() {
		return installmentsInArrears;
	}

	public void setInstallmentsInArrears(String installmentsInArrears) {
		this.installmentsInArrears = installmentsInArrears;
	}

	public double getInterestRateAtDisbursement() {
		return interestRateAtDisbursement;
	}

	public void setInterestRateAtDisbursement(double interestRateAtDisbursement) {
		this.interestRateAtDisbursement = interestRateAtDisbursement;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getNoOfDependants() {
		return noOfDependants;
	}

	public void setNoOfDependants(String noOfDependants) {
		this.noOfDependants = noOfDependants;
	}

	public String getNumberOfJointLoanParticipants() {
		return numberOfJointLoanParticipants;
	}

	public void setNumberOfJointLoanParticipants(String numberOfJointLoanParticipants) {
		this.numberOfJointLoanParticipants = numberOfJointLoanParticipants;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOldAccountNumber() {
		return oldAccountNumber;
	}

	public void setOldAccountNumber(String oldAccountNumber) {
		this.oldAccountNumber = oldAccountNumber;
	}

	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getScheduledPaymentAmount() {
		return scheduledPaymentAmount;
	}

	public void setScheduledPaymentAmount(String scheduledPaymentAmount) {
		this.scheduledPaymentAmount = scheduledPaymentAmount;
	}

	public String getSectorOfActivity() {
		return sectorOfActivity;
	}

	public void setSectorOfActivity(String sectorOfActivity) {
		this.sectorOfActivity = sectorOfActivity;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getTermsDuration() {
		return termsDuration;
	}

	public void setTermsDuration(String termsDuration) {
		this.termsDuration = termsDuration;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	
	
	
}
