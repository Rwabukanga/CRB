package com.CRBProjectt.CRBProjectt.InnerDomain;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.Classification;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.PolicyStatus;
import com.CRBProjectt.CRBProjectt.domain.Policytype;
import com.CRBProjectt.CRBProjectt.domain.Salutation;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerPolicydetails {
	
    
	private String basePolicyNumber;
	
	private Date baseTransactionDate;
	
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@Enumerated(EnumType.STRING)
	private IdentificationdocumentType identification;
	
	private String currency;
	
	private String customerType;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date endorsementDate;
	
	private String endorsementNumber;
	
	private String firstName;
	
	private double grossPremiumAmount;
	
	private String identificationDocumentNumber;
	
	private String institutionName;
	
	private double insuredAmount;
	
	private String middleName;
	
	private String numberOfPersonsCovered;
	
	private String otherInformation;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date policyExpiryDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date policyStartDate;
	
	@Enumerated(EnumType.STRING)
	private PolicyStatus policystatus;
	
	@Enumerated(EnumType.STRING)
	private Policytype policytype;
	
	@Enumerated(EnumType.STRING)
	private Salutation salutation;
	
	private String surName;
	
	private String tradingName;

	public Date getBaseTransactionDate() {
		return baseTransactionDate;
	}

	public void setBaseTransactionDate(Date baseTransactionDate) {
		this.baseTransactionDate = baseTransactionDate;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public IdentificationdocumentType getIdentification() {
		return identification;
	}

	public void setIdentification(IdentificationdocumentType identification) {
		this.identification = identification;
	}

	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Date getEndorsementDate() {
		return endorsementDate;
	}

	public void setEndorsementDate(Date endorsementDate) {
		this.endorsementDate = endorsementDate;
	}

	public String getEndorsementNumber() {
		return endorsementNumber;
	}

	public void setEndorsementNumber(String endorsementNumber) {
		this.endorsementNumber = endorsementNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getGrossPremiumAmount() {
		return grossPremiumAmount;
	}

	public void setGrossPremiumAmount(double grossPremiumAmount) {
		this.grossPremiumAmount = grossPremiumAmount;
	}

	public String getIdentificationDocumentNumber() {
		return identificationDocumentNumber;
	}

	public void setIdentificationDocumentNumber(String identificationDocumentNumber) {
		this.identificationDocumentNumber = identificationDocumentNumber;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNumberOfPersonsCovered() {
		return numberOfPersonsCovered;
	}

	public void setNumberOfPersonsCovered(String numberOfPersonsCovered) {
		this.numberOfPersonsCovered = numberOfPersonsCovered;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}

	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}

	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public PolicyStatus getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(PolicyStatus policystatus) {
		this.policystatus = policystatus;
	}

	public Policytype getPolicytype() {
		return policytype;
	}

	public void setPolicytype(Policytype policytype) {
		this.policytype = policytype;
	}

	public Salutation getSalutation() {
		return salutation;
	}

	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getBasePolicyNumber() {
		return basePolicyNumber;
	}

	public void setBasePolicyNumber(String basePolicyNumber) {
		this.basePolicyNumber = basePolicyNumber;
	}
	
	
	

}
