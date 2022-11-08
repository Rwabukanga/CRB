package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicalclaim {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "amountOfClaimReserve", nullable = false)
	private String amountOfClaimReserve;
	
	@Column(name = "amountPaid", nullable = false)
	private String amountPaid;
	
	@Column(name = "claimDeclarationDate", nullable = false)
	private Date claimDeclarationDate;
	
	@Column(name = "claimNumber", nullable = false)
	private String claimNumber;
	
	@Column(name = "claimSettlementDate", nullable = false)
	private Date claimSettlementDate;
	
//	@Column(name = "claimStatus", nullable = false)
//	private String claimStatus;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimStatus;
	
	@Column(name = "identificationDocumentNumberOfServiceBeneficiary", nullable = false)
	private String identificationDocumentNumberOfServiceBeneficiary;
	
//	@Column(name = "identificationDocumentTypeOfServiceBeneficiary", nullable = false)
//	private String identificationDocumentTypeOfServiceBeneficiary;
	
	@Enumerated(EnumType.STRING)
	private IdentificationdocumentType identificationDocumentTypeOfServiceBeneficiary;
	
	@Column(name = "policyNumber", nullable = false)
	private String policyNumber;
	
	@Column(name = "rejectionReason", nullable = false)
	private String rejectionReason;
	
	@Column(name = "serviceBeneficiaryName", nullable = false)
	private String serviceBeneficiaryName;
	
	@Column(name = "serviceBeneficiarySurname", nullable = false)
	private String serviceBeneficiarySurname;
	
	@Column(name = "serviceProviderAddress", nullable = false)
	private String serviceProviderAddress;
	
	@Column(name = "serviceProviderName", nullable = false)
	private String serviceProviderName;
	
//	@Column(name = "serviceProviderType", nullable = false)
//	private String serviceProviderType;
	
	@Enumerated(EnumType.STRING)
	private ServiceProviderType serviceProviderType;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Date getClaimDeclarationDate() {
		return claimDeclarationDate;
	}

	public void setClaimDeclarationDate(Date claimDeclarationDate) {
		this.claimDeclarationDate = claimDeclarationDate;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public Date getClaimSettlementDate() {
		return claimSettlementDate;
	}

	public void setClaimSettlementDate(Date claimSettlementDate) {
		this.claimSettlementDate = claimSettlementDate;
	}

	

	public String getIdentificationDocumentNumberOfServiceBeneficiary() {
		return identificationDocumentNumberOfServiceBeneficiary;
	}

	public void setIdentificationDocumentNumberOfServiceBeneficiary(
			String identificationDocumentNumberOfServiceBeneficiary) {
		this.identificationDocumentNumberOfServiceBeneficiary = identificationDocumentNumberOfServiceBeneficiary;
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

	public String getServiceBeneficiaryName() {
		return serviceBeneficiaryName;
	}

	public void setServiceBeneficiaryName(String serviceBeneficiaryName) {
		this.serviceBeneficiaryName = serviceBeneficiaryName;
	}

	public String getServiceBeneficiarySurname() {
		return serviceBeneficiarySurname;
	}

	public void setServiceBeneficiarySurname(String serviceBeneficiarySurname) {
		this.serviceBeneficiarySurname = serviceBeneficiarySurname;
	}

	public String getServiceProviderAddress() {
		return serviceProviderAddress;
	}

	public void setServiceProviderAddress(String serviceProviderAddress) {
		this.serviceProviderAddress = serviceProviderAddress;
	}

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

	public IdentificationdocumentType getIdentificationDocumentTypeOfServiceBeneficiary() {
		return identificationDocumentTypeOfServiceBeneficiary;
	}

	public void setIdentificationDocumentTypeOfServiceBeneficiary(
			IdentificationdocumentType identificationDocumentTypeOfServiceBeneficiary) {
		this.identificationDocumentTypeOfServiceBeneficiary = identificationDocumentTypeOfServiceBeneficiary;
	}

	public ServiceProviderType getServiceProviderType() {
		return serviceProviderType;
	}

	public void setServiceProviderType(ServiceProviderType serviceProviderType) {
		this.serviceProviderType = serviceProviderType;
	}

	
	
	
	
	
	
	
	
	
}
