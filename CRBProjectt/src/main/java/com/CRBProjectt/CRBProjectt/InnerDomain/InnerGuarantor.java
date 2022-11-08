package com.CRBProjectt.CRBProjectt.InnerDomain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.GuarantorType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerGuarantor {
	
	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
	@Column(name = "companyRegNo", nullable = false)
	private String companyRegNo;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "companyRegistrationDate", nullable = false)
	private Date companyRegistrationDate;
	
	
	private int countryid;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateOfBirth", nullable = false)
	private Date dateOfBirth;
	
	@Column(name = "foreName2", nullable = false)
	private String foreName2;
	
	@Column(name = "foreName3", nullable = false)
	private String foreName3;
	
//	@Column(name = "guarantorType", nullable = false)
//	private String guarantorType;
	
	@Enumerated(EnumType.STRING)
	private GuarantorType guarantorType;
	
	@Column(name = "homeTelephone", nullable = false)
	private String homeTelephone;
	
	@Column(name = "institutionName", nullable = false)
	private String institutionName;
	
	@Column(name = "mobileTelephone", nullable = false)
	private String mobileTelephone;
	
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
	
	@Column(name = "surName", nullable = false)
	private String surName;
	
	@Column(name = "telephone1", nullable = false)
	private String telephone1;
	
	@Column(name = "telephone2", nullable = false)
	private String telephone2;
	
	@Column(name = "telephone3", nullable = false)
	private String telephone3;
	
	@Column(name = "town", nullable = false)
	private String town;
	
	@Column(name = "tradingName", nullable = false)
	private String tradingName;
	
	@Column(name = "workTelephone", nullable = false)
	private String workTelephone;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public int getCountryid() {
		return countryid;
	}

	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public GuarantorType getGuarantorType() {
		return guarantorType;
	}

	public void setGuarantorType(GuarantorType guarantorType) {
		this.guarantorType = guarantorType;
	}

	public String getHomeTelephone() {
		return homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getMobileTelephone() {
		return mobileTelephone;
	}

	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
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

	public String getWorkTelephone() {
		return workTelephone;
	}

	public void setWorkTelephone(String workTelephone) {
		this.workTelephone = workTelephone;
	}
	
	
	
	

}
