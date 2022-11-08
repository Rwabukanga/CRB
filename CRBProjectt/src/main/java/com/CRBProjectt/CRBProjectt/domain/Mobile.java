package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Mobile {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "accountProductType", nullable = false)
	private String accountProductType;
	
//	@Column(name = "accountStatus", nullable = false)
//	private String accountStatus;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus accountStatus;
	
//	@Column(name = "classification", nullable = false)
//	private String classification;
	
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	@Column(name = "customerRef", nullable = false)
	private String customerRef;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateClosed", nullable = false)
	private Date dateClosed;
	
	@Column(name = "daysInArrears", nullable = false)
	private String daysInArrears;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "disbursementDate", nullable = false)
	private Date disbursementDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dob", nullable = false)
	private Date dob;
	
	@Column(name = "documentNumber", nullable = false)
	private String documentNumber;
	
	@Column(name = "documentType", nullable = false)
	private String documentType;
	
	@Column(name = "foreName1", nullable = false)
	private String foreName1;
	
	@Column(name = "foreName2", nullable = false)
	private String foreName2;
	
	@Column(name = "foreName3", nullable = false)
	private String foreName3;
	
	@ManyToOne
	private Gender genderid;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "lastPaymentDate", nullable = false)
	private Date lastPaymentDate;
	
	@Column(name = "loanAccount", nullable = false)
	private String loanAccount;
	
	@Column(name = "loanBalance", nullable = false)
	private String loanBalance;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "maturityDate", nullable = false)
	private Date maturityDate;
	
	@Column(name = "mobileNumber", nullable = false)
	private String mobileNumber;
	
	@Column(name = "principalAmount", nullable = false)
	private double principalAmount;
	
	@Column(name = "surName", nullable = false)
	private String surName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountProductType() {
		return accountProductType;
	}

	public void setAccountProductType(String accountProductType) {
		this.accountProductType = accountProductType;
	}
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
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

	public Date getDisbursementDate() {
		return disbursementDate;
	}

	public void setDisbursementDate(Date disbursementDate) {
		this.disbursementDate = disbursementDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
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

	public String getForeName3() {
		return foreName3;
	}

	public void setForeName3(String foreName3) {
		this.foreName3 = foreName3;
	}

	public Gender getGenderid() {
		return genderid;
	}

	public void setGenderid(Gender genderid) {
		this.genderid = genderid;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public String getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(String loanAccount) {
		this.loanAccount = loanAccount;
	}

	public String getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(String loanBalance) {
		this.loanBalance = loanBalance;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	
	
	
	
	
	
	
	

}
