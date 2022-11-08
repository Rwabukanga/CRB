package com.CRBProjectt.CRBProjectt.InnerDomain;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.PolicyCover;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerbondsClaims {

	
	@Column(name = "amountOfClaimReserve", nullable = false)
	private String amountOfClaimReserve;
	
	@Column(name = "amountPaid", nullable = false)
	private String amountPaid;
	
	@Column(name = "beneficiary", nullable = false)
	private String beneficiary;
	
	@Column(name = "beneficiaryAddress", nullable = false)
	private String beneficiaryAddress;
	
	@Column(name = "beneficiaryIdentificationDocumentNumber", nullable = false)
	private String beneficiaryIdentificationDocumentNumber;
	
//	@Column(name = "beneficiaryIdentificationDocumentType", nullable = false)
//	private String beneficiaryIdentificationDocumentType;
	
	@Enumerated(EnumType.STRING)
	private IdentificationdocumentType beneficiaryIdentificationDocumentType;
	
	
	@Column(name = "claimDeclarationDate", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private String claimDeclarationDate;
	
	@Column(name = "claimDescription", nullable = false)
	private String claimDescription;
	
	@Column(name = "claimNumber", nullable = false)
	private String claimNumber;
	
	@Column(name = "claimSettlementDate", nullable = false)
	@JsonFormat(pattern="yyyyMMdd")
	private String claimSettlementDate;
	
//	@Column(name = "claimStatus", nullable = false)
//	private String claimStatus;
	
//	@Column(name = "policyCover", nullable = false)
//	private String policyCover;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimStatus;
	
	@Enumerated(EnumType.STRING)
	private PolicyCover policyCover;
	
	
	@Column(name = "policyNumber", nullable = false)
	private String policyNumber;
	
	@Column(name = "rejectionReason", nullable = false)
	private String rejectionReason;

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

	public String getBeneficiaryIdentificationDocumentNumber() {
		return beneficiaryIdentificationDocumentNumber;
	}

	public void setBeneficiaryIdentificationDocumentNumber(String beneficiaryIdentificationDocumentNumber) {
		this.beneficiaryIdentificationDocumentNumber = beneficiaryIdentificationDocumentNumber;
	}

	

	public String getClaimDeclarationDate() {
		return claimDeclarationDate;
	}

	public void setClaimDeclarationDate(String claimDeclarationDate) {
		this.claimDeclarationDate = claimDeclarationDate;
	}

	public String getClaimDescription() {
		return claimDescription;
	}

	public void setClaimDescription(String claimDescription) {
		this.claimDescription = claimDescription;
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

	public IdentificationdocumentType getBeneficiaryIdentificationDocumentType() {
		return beneficiaryIdentificationDocumentType;
	}

	public void setBeneficiaryIdentificationDocumentType(IdentificationdocumentType beneficiaryIdentificationDocumentType) {
		this.beneficiaryIdentificationDocumentType = beneficiaryIdentificationDocumentType;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

	public PolicyCover getPolicyCover() {
		return policyCover;
	}

	public void setPolicyCover(PolicyCover policyCover) {
		this.policyCover = policyCover;
	}
	
	
}
