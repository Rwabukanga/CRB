package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class CorporalAccidentClaim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "amountOfClaimReserve", nullable = false)
	private String amountOfClaimReserve;
	
	@Column(name = "amountPaid", nullable = false)
	private String amountPaid;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "claimDeclarationDate", nullable = false)
	private Date claimDeclarationDate;
	
	@Column(name = "claimNumber", nullable = false)
	private String claimNumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "claimSettlementDate", nullable = false)
	private Date claimSettlementDate;
	
//	@Column(name = "claimStatus", nullable = false)
//	private String claimStatus;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimStatus;
	
	

	@Enumerated(EnumType.STRING)
	private Claimtypes claimType;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "incidentDate", nullable = false)
	private Date incidentDate;
	
	@Column(name = "incidentDescription", nullable = false)
	private String incidentDescription;
	
	@Column(name = "injuriesDescription", nullable = false)
	private String injuriesDescription;
	
	@Column(name = "placeOfIncident", nullable = false)
	private String placeOfIncident;
	
	@Column(name = "policyNumber", nullable = false)
	private String policyNumber;
	
	@Column(name = "rejectionReason", nullable = false)
	private String rejectionReason;

	

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
	
	public Date getIncidentDate() {
		return incidentDate;
	}

	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getIncidentDescription() {
		return incidentDescription;
	}

	public void setIncidentDescription(String incidentDescription) {
		this.incidentDescription = incidentDescription;
	}

	public String getInjuriesDescription() {
		return injuriesDescription;
	}

	public void setInjuriesDescription(String injuriesDescription) {
		this.injuriesDescription = injuriesDescription;
	}

	public String getPlaceOfIncident() {
		return placeOfIncident;
	}

	public void setPlaceOfIncident(String placeOfIncident) {
		this.placeOfIncident = placeOfIncident;
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

	
	
	
	
	
}
