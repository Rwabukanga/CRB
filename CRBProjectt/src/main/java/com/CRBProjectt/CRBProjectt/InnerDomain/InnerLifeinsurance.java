package com.CRBProjectt.CRBProjectt.InnerDomain;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.Claimtypes;
import com.CRBProjectt.CRBProjectt.domain.Classofinsurance;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.Typeofclaim;

public class InnerLifeinsurance {
	
	
	
	@Column(name = "amountOfClaimReserve", nullable = false)
	private String amountOfClaimReserve;
	
	@Column(name = "amountPaid", nullable = false)
	private String amountPaid;
	
	@Column(name = "beneficiary", nullable = false)
	private String beneficiary;
	
	@Column(name = "beneficiaryAddress", nullable = false)
	private String beneficiaryAddress;
	
	@Column(name = "claimDeclarationDate", nullable = false)
	private String claimDeclarationDate;
	
	@Column(name = "claimNumber", nullable = false)
	private String claimNumber;
	
	@Column(name = "claimSettlementDate", nullable = false)
	private String claimSettlementDate;
	
//	@Column(name = "claimStatus", nullable = false)
//	private String claimStatus;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimStatus;
	
//	@Column(name = "claimType", nullable = false)
//	private String claimType;
	
	@Enumerated(EnumType.STRING)
	private Claimtypes claimType;
	
//	@Column(name = "claimType", nullable = false)
//	private String classOfInsurance;
	
	@Enumerated(EnumType.STRING)
	private Classofinsurance classOfInsurance;
	
	@Column(name = "identificationDocumentNumber", nullable = false)
	private String identificationDocumentNumber;
	
//	@Column(name = "identificationDocumentType", nullable = false)
//	private String identificationDocumentType;
	
	@Enumerated(EnumType.STRING)
	private IdentificationdocumentType identificationDocumentType;
	
	@Column(name = "incidentDate", nullable = false)
	private String incidentDate;
	
	@Column(name = "policyNumber", nullable = false)
	private String policyNumber;
	
	@Column(name = "rejectionReason", nullable = false)
	private String rejectionReason;
	
	@Enumerated(EnumType.STRING)
	private Typeofclaim typeofclaim;

	public String getAmountOfClaimReserve() {
		return amountOfClaimReserve;
	}

	public void setAmountOfClaimReserve(String amountOfClaimReserve) {
		this.amountOfClaimReserve = amountOfClaimReserve;
	}

	public String getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBeneficiaryAddress() {
		return beneficiaryAddress;
	}

	public void setBeneficiaryAddress(String beneficiaryAddress) {
		this.beneficiaryAddress = beneficiaryAddress;
	}

	public String getClaimDeclarationDate() {
		return claimDeclarationDate;
	}

	public void setClaimDeclarationDate(String claimDeclarationDate) {
		this.claimDeclarationDate = claimDeclarationDate;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getClaimSettlementDate() {
		return claimSettlementDate;
	}

	public void setClaimSettlementDate(String claimSettlementDate) {
		this.claimSettlementDate = claimSettlementDate;
	}

	public String getIdentificationDocumentNumber() {
		return identificationDocumentNumber;
	}

	public void setIdentificationDocumentNumber(String identificationDocumentNumber) {
		this.identificationDocumentNumber = identificationDocumentNumber;
	}

	

	public String getIncidentDate() {
		return incidentDate;
	}

	public void setIncidentDate(String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

	public Claimtypes getClaimType() {
		return claimType;
	}

	public void setClaimType(Claimtypes claimType) {
		this.claimType = claimType;
	}

	public Classofinsurance getClassOfInsurance() {
		return classOfInsurance;
	}

	public void setClassOfInsurance(Classofinsurance classOfInsurance) {
		this.classOfInsurance = classOfInsurance;
	}

	public IdentificationdocumentType getIdentificationDocumentType() {
		return identificationDocumentType;
	}

	public void setIdentificationDocumentType(IdentificationdocumentType identificationDocumentType) {
		this.identificationDocumentType = identificationDocumentType;
	}

	public Typeofclaim getTypeofclaim() {
		return typeofclaim;
	}

	public void setTypeofclaim(Typeofclaim typeofclaim) {
		this.typeofclaim = typeofclaim;
	}
	
	
	
	
	

}
