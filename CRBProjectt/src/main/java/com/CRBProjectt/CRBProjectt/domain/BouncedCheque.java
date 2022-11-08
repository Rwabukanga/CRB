package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class BouncedCheque {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
//	@Column(name = "accountType", nullable = false)
//	private String accountType;
	
	@Enumerated(EnumType.STRING)
	private Accounttype accountType;
	
	@Column(name = "beneficiaryName", nullable = false)
	private String beneficiaryName;
	
	@Column(name = "chequeAmount", nullable = false)
	private String chequeAmount;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "chequeDate", nullable = false)
	private String chequeDate;
	
	@Column(name = "chequeNumber", nullable = false)
	private String chequeNumber;
	
	@Column(name = "companyRegNo", nullable = false)
	private String companyRegNo;
	
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "companyRegistrationDate", nullable = false)
	private String companyRegistrationDate;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	
	@ManyToOne(targetEntity=Country.class, fetch=FetchType.EAGER)
	@JoinColumn(name="countryid")
	private Country countryid;
	
	
	
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateOfBirth", nullable = false)
	private Date dateOfBirth;
	
	@Column(name = "foreName1", nullable = false)
	private String foreName1;
	
	
	@Column(name = "foreName2", nullable = false)
	private String foreName2;
	
	@Column(name = "foreName3", nullable = false)
	private String foreName3;
	
	@Column(name = "institutionName", nullable = false)
	private String institutionName;
	
	@Column(name = "nationalId", nullable = false)
	private String nationalId;
	
	@Column(name = "nationality", nullable = false)
	private String nationality;
	
	@Column(name = "passportNumber", nullable = false)
	private String passportNumber;
	
	@Column(name = "placeOfBirth", nullable = false)
	private String placeOfBirth;
	
	@Column(name = "postalAddressNumber", nullable = false)
	private String postalAddressNumber;
	
	@Column(name = "postalCode", nullable = false)
	private String postalCode;
		
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "reportedDate", nullable = false)
	private String reportedDate;
	
//	@Column(name = "returnedChequeReason", nullable = false)
//	private String returnedChequeReason;
	@Enumerated(EnumType.STRING)
	private ReturnedChequeReason returnedChequeReason;
	
	@Column(name = "surName", nullable = false)
	private String surName;
	
	@Column(name = "town", nullable = false)
	private String town;
	
	@Column(name = "tradingName", nullable = false)
	private String tradingName;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Accounttype getAccountType() {
		return accountType;
	}

	public void setAccountType(Accounttype accountType) {
		this.accountType = accountType;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setReturnedChequeReason(ReturnedChequeReason returnedChequeReason) {
		this.returnedChequeReason = returnedChequeReason;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(String chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public String getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getCompanyRegistrationDate() {
		return companyRegistrationDate;
	}

	public void setCompanyRegistrationDate(String companyRegistrationDate) {
		this.companyRegistrationDate = companyRegistrationDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Country getCountryid() {
		return countryid;
	}

	public void setCountryid(Country countryid) {
		this.countryid = countryid;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
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

	public String getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(String reportedDate) {
		this.reportedDate = reportedDate;
	}
	public ReturnedChequeReason getReturnedChequeReason() {
		return returnedChequeReason;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}
	
	
	
	
	

}
