package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Tln03Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "accountnumber", nullable = false)
	private String accountnumber;
	
	@Column(name = "accountowner", nullable = false)
	private String accountowner;
	
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
	private double amountPastDue;
	
	@Column(name = "approvalDate", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private Date approvalDate;
	
	@Column(name = "availableCredit", nullable = false)
	private double availableCredit;
	
//	@Column(name = "category", nullable = false)
//	private String category;
	@Enumerated(EnumType.STRING)
	private Category category;
	
//	@Column(name = "classification", nullable = false)
//	private String classification;
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
//	@ManyToOne
//	private Country countryid;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CurrencyType", nullable = false)
	private CurrencyType CurrencyType;
	
	@Column(name = "currentBalance", nullable = false)
	private double currentBalance;
	
	@Column(name = "currentBalanceIndicator", nullable = false)
	private String currentBalanceIndicator;
	
	@Column(name = "dateAccountOpened", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateAccountOpened;
	
	@Column(name = "dateAccountUpdated", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private Date dateAccountUpdated;
	
	@Column(name = "dateClosed", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private Date dateClosed;
	
	@Column(name = "daysInArrears", nullable = false)
	private String daysInArrears;
	
	@Column(name = "facsimile", nullable = false)
	private String facsimile;
	
	@Column(name = "finalPaymentDate", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private Date finalPaymentDate;
	
	@Column(name = "firstPaymentDate", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private Date firstPaymentDate;
	
	@Column(name = "foreName1", nullable = false)
	private String foreName1;
	
	@Column(name = "foreName2", nullable = false)
	private String foreName2;
	
	@Column(name = "income", nullable = false)
	private double income;
	
//	@Column(name = "incomeFrequency", nullable = false)
//	private double incomeFrequency;
	@Enumerated(EnumType.STRING)
	private IncomeFrequency incomeFrequency;
	
	@Column(name = "installmentsInArrears", nullable = false)
	private String installmentsInArrears;
	
	@Column(name = "interestRateAtDisbursement", nullable = false)
	private double interestRateAtDisbursement;
	
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "lastPaymentDate", nullable = false)
	private Date lastPaymentDate;
	
	@Column(name = "nature", nullable = false)
	private String nature;
	
	@Column(name = "noOfDependants", nullable = false)
	private String noOfDependants;
	
	@Column(name = "numberOfJointLoanParticipants", nullable = false)
	private String numberOfJointLoanParticipants;
	
	@Column(name = "occupation", nullable = false)
	private String occupation;
	
	@Column(name = "oldAccountNumber", nullable = false)
	private String oldAccountNumber;
	
	@Column(name = "openingBalance", nullable = false)
	private String openingBalance;
	
//	@Column(name = "salutation", nullable = false)
//	private String salutation;
	
	@Enumerated(EnumType.STRING)
	private Salutation salutation;
	
	@Column(name = "scheduledPaymentAmount", nullable = false)
	private String scheduledPaymentAmount;
	
	@Column(name = "sectorOfActivity", nullable = false)
	private String sectorOfActivity;
	
	@Column(name = "taxNumber", nullable = false)
	private String taxNumber;
	
	@Column(name = "termsDuration", nullable = false)
	private String termsDuration;
	
	@OneToOne
	@JoinColumn(name="clientid")
	private Tcl01Client clientid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	public IncomeFrequency getIncomeFrequency() {
		return incomeFrequency;
	}

	public void setIncomeFrequency(IncomeFrequency incomeFrequency) {
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

	public Tcl01Client getClientid() {
		return clientid;
	}
	public void setClientid(Tcl01Client clientid) {
		this.clientid = clientid;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public Salutation getSalutation() {
		return salutation;
	}

	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
