package com.CRBProjectt.CRBProjectt.InnerDomain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.CRBProjectt.CRBProjectt.domain.AccountStatus;
import com.CRBProjectt.CRBProjectt.domain.Accounttype;
import com.CRBProjectt.CRBProjectt.domain.Classification;
import com.CRBProjectt.CRBProjectt.domain.CurrencyType;
import com.CRBProjectt.CRBProjectt.domain.Sector;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerCoporateCredit {

	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
	@Column(name = "accountOwner", nullable = false)
	private String accountOwner;
	
	@Column(name = "accountRepaymentTerm", nullable = false)
	private String accountRepaymentTerm;
	
//	@Column(name = "accountStatus", nullable = false)
//	private String accountStatus;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus accountStatus;
	
//	@Column(name = "accountType", nullable = false)
//	private String accountType;
	
	@Enumerated(EnumType.STRING)
	private Accounttype accountType;
	
	@Column(name = "actualPaymentAmount", nullable = false)
	private String actualPaymentAmount;
	
	@Column(name = "amountPastDue", nullable = false)
	private String amountPastDue;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "approvalDate", nullable = false)
	private Date approvalDate;
	
	@Column(name = "availableCredit", nullable = false)
	private String  availableCredit;
	
	@Column(name = "category", nullable = false)
	private String  category;
	
//	@Column(name = "classification", nullable = false)
//	private String classification;
	
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "companyCeaseDate", nullable = false)
	private Date companyCeaseDate;
	
	@Column(name = "companyRegNo", nullable = false)
	private String companyRegNo;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "companyRegistrationDate", nullable = false)
	private Date companyRegistrationDate;
	
//	@ManyToOne
//	private Country countryid;
	
//	@Column(name = "currencyType", nullable = false)
//	private String currencyType;
	
	@Enumerated(EnumType.STRING)
	private CurrencyType currencyType;
	
	@Column(name = "currentBalance", nullable = false)
	private Double currentBalance;
	
	@Column(name = "currentBalanceIndicator", nullable = false)
	private String currentBalanceIndicator;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateAccountOpened", nullable = false)
	private Date dateAccountOpened;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateAccountUpdated", nullable = false)
	private Date dateAccountUpdated;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateClosed", nullable = false)
	private Date dateClosed;
	
	@Column(name = "daysInArrears", nullable = false)
	private String daysInArrears;
	
	@Column(name = "emailAddress", nullable = false)
	private String emailAddress;
	
	@Column(name = "facsimile1", nullable = false)
	private String facsimile1;
	
	@Column(name = "facsimile2", nullable = false)
	private String facsimile2;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "finalPaymentDate", nullable = false)
	private Date finalPaymentDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "firstPaymentDate", nullable = false)
	private Date firstPaymentDate;
	
	@Column(name = "industry", nullable = false)
	private String industry;
	
	@Column(name = "installmentsInArrears", nullable = false)
	private String installmentsInArrears;
	
	@Column(name = "institution", nullable = false)
	private String institution;
	
	@Column(name = "interestRateAtDisbursement", nullable = false)
	private String interestRateAtDisbursement;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "lastPaymentDate", nullable = false)
	private Date lastPaymentDate;
	
	@Column(name = "nature", nullable = false)
	private String nature;
	
	@Column(name = "numberOfJointLoanParticipants", nullable = false)
	private String numberOfJointLoanParticipants;
	
	@Column(name = "openingBalance", nullable = false)
	private String openingBalance;
	
	@Column(name = "physicalAddressCell", nullable = false)
	private String physicalAddressCell;
	
//	@Column(name = "physicalAddressCell", nullable = false)
//	private String physicalAddressDistrict;
	@Column(name = "physicalAddressLine1", nullable = false)
	private String physicalAddressLine1;
	
	@Column(name = "physicalAddressLine2", nullable = false)
	private String physicalAddressLine2;
	
	@Column(name = "physicalAddressPlotNumber", nullable = false)
	private String physicalAddressPlotNumber;
	
	@Column(name = "physicalAddressPostalCode", nullable = false)
	private String physicalAddressPostalCode;
	
	@ManyToOne
	private int sectorid;
	
	@Column(name = "postalAddressNumber", nullable = false)
	private String postalAddressNumber;
	
	@Column(name = "postalCode", nullable = false)
	private String postalCode;
	
	@Column(name = "scheduledPaymentAmount", nullable = false)
	private String scheduledPaymentAmount;
	
	@Column(name = "sectorOfActivity", nullable = false)
	private String sectorOfActivity;
	
	@Column(name = "taxNo", nullable = false)
	private String taxNo;
	
	@Column(name = "telephone1", nullable = false)
	private String telephone1;
	
	@Column(name = "telephone2", nullable = false)
	private String telephone2;
	
	@Column(name = "telephone3", nullable = false)
	private String telephone3;
	
	@Column(name = "telephone4", nullable = false)
	private String telephone4;
	
	@Column(name = "telephone5", nullable = false)
	private String telephone5;
	
	@Column(name = "telephone6", nullable = false)
	private String telephone6;
	
	@Column(name = "termsDuration", nullable = false)
	private String termsDuration;
	
	@Column(name = "tradingName", nullable = false)
	private String tradingName;
	
	@Column(name = "vatNo", nullable = false)
	private String vatNo;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public String getAccountRepaymentTerm() {
		return accountRepaymentTerm;
	}

	public void setAccountRepaymentTerm(String accountRepaymentTerm) {
		this.accountRepaymentTerm = accountRepaymentTerm;
	}

	

	public String getActualPaymentAmount() {
		return actualPaymentAmount;
	}

	public void setActualPaymentAmount(String actualPaymentAmount) {
		this.actualPaymentAmount = actualPaymentAmount;
	}

	public String getAmountPastDue() {
		return amountPastDue;
	}

	public void setAmountPastDue(String amountPastDue) {
		this.amountPastDue = amountPastDue;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(String availableCredit) {
		this.availableCredit = availableCredit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

	public Date getCompanyCeaseDate() {
		return companyCeaseDate;
	}

	public void setCompanyCeaseDate(Date companyCeaseDate) {
		this.companyCeaseDate = companyCeaseDate;
	}

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public Date getCompanyRegistrationDate() {
		return companyRegistrationDate;
	}

	public void setCompanyRegistrationDate(Date companyRegistrationDate) {
		this.companyRegistrationDate = companyRegistrationDate;
	}

	

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFacsimile1() {
		return facsimile1;
	}

	public void setFacsimile1(String facsimile1) {
		this.facsimile1 = facsimile1;
	}

	public String getFacsimile2() {
		return facsimile2;
	}

	public void setFacsimile2(String facsimile2) {
		this.facsimile2 = facsimile2;
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

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getInstallmentsInArrears() {
		return installmentsInArrears;
	}

	public void setInstallmentsInArrears(String installmentsInArrears) {
		this.installmentsInArrears = installmentsInArrears;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getInterestRateAtDisbursement() {
		return interestRateAtDisbursement;
	}

	public void setInterestRateAtDisbursement(String interestRateAtDisbursement) {
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

	public String getNumberOfJointLoanParticipants() {
		return numberOfJointLoanParticipants;
	}

	public void setNumberOfJointLoanParticipants(String numberOfJointLoanParticipants) {
		this.numberOfJointLoanParticipants = numberOfJointLoanParticipants;
	}

	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getPhysicalAddressCell() {
		return physicalAddressCell;
	}

	public void setPhysicalAddressCell(String physicalAddressCell) {
		this.physicalAddressCell = physicalAddressCell;
	}

	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}

	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}

	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}

	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}

	public String getPhysicalAddressPlotNumber() {
		return physicalAddressPlotNumber;
	}

	public void setPhysicalAddressPlotNumber(String physicalAddressPlotNumber) {
		this.physicalAddressPlotNumber = physicalAddressPlotNumber;
	}

	public String getPhysicalAddressPostalCode() {
		return physicalAddressPostalCode;
	}

	public void setPhysicalAddressPostalCode(String physicalAddressPostalCode) {
		this.physicalAddressPostalCode = physicalAddressPostalCode;
	}
	public int getSectorid() {
		return sectorid;
	}

	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}

	public String getPostalAddressNumber() {
		return postalAddressNumber;
	}

	public void setPostalAddressNumber(String postalAddressNumber) {
		this.postalAddressNumber = postalAddressNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getTelephone3() {
		return telephone3;
	}

	public void setTelephone3(String telephone3) {
		this.telephone3 = telephone3;
	}

	public String getTelephone4() {
		return telephone4;
	}

	public void setTelephone4(String telephone4) {
		this.telephone4 = telephone4;
	}

	public String getTelephone5() {
		return telephone5;
	}

	public void setTelephone5(String telephone5) {
		this.telephone5 = telephone5;
	}

	public String getTelephone6() {
		return telephone6;
	}

	public void setTelephone6(String telephone6) {
		this.telephone6 = telephone6;
	}

	public String getTermsDuration() {
		return termsDuration;
	}

	public void setTermsDuration(String termsDuration) {
		this.termsDuration = termsDuration;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getVatNo() {
		return vatNo;
	}

	public void setVatNo(String vatNo) {
		this.vatNo = vatNo;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Accounttype getAccountType() {
		return accountType;
	}

	public void setAccountType(Accounttype accountType) {
		this.accountType = accountType;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public CurrencyType getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}
	
	
	
	
	
}
