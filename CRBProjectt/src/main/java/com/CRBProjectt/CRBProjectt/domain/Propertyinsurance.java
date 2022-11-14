package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Propertyinsurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String policynumber;
	
	private String claimnumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date claimdeclarationdate;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimstatus;
	
	private String  rejectionreason;
	
	private String amountofclaimreserve;
	
	private double amountpaid;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date Claimsettlementdate;
	
	private String incidentdescription;
	
	private String damagesdescription;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date incidentdate;
	
	private String placeofincident;
	
	@Enumerated(EnumType.STRING)
	private Claimtypes claimtype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}

	public String getClaimnumber() {
		return claimnumber;
	}

	public void setClaimnumber(String claimnumber) {
		this.claimnumber = claimnumber;
	}

	public Date getClaimdeclarationdate() {
		return claimdeclarationdate;
	}

	public void setClaimdeclarationdate(Date claimdeclarationdate) {
		this.claimdeclarationdate = claimdeclarationdate;
	}

	public ClaimStatus getClaimstatus() {
		return claimstatus;
	}

	public void setClaimstatus(ClaimStatus claimstatus) {
		this.claimstatus = claimstatus;
	}

	public String getRejectionreason() {
		return rejectionreason;
	}

	public void setRejectionreason(String rejectionreason) {
		this.rejectionreason = rejectionreason;
	}

	public String getAmountofclaimreserve() {
		return amountofclaimreserve;
	}

	public void setAmountofclaimreserve(String amountofclaimreserve) {
		this.amountofclaimreserve = amountofclaimreserve;
	}

	public double getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public Date getClaimsettlementdate() {
		return Claimsettlementdate;
	}

	public void setClaimsettlementdate(Date claimsettlementdate) {
		Claimsettlementdate = claimsettlementdate;
	}

	public String getIncidentdescription() {
		return incidentdescription;
	}

	public void setIncidentdescription(String incidentdescription) {
		this.incidentdescription = incidentdescription;
	}

	public String getDamagesdescription() {
		return damagesdescription;
	}

	public void setDamagesdescription(String damagesdescription) {
		this.damagesdescription = damagesdescription;
	}

	public Date getIncidentdate() {
		return incidentdate;
	}

	public void setIncidentdate(Date incidentdate) {
		this.incidentdate = incidentdate;
	}

	public String getPlaceofincident() {
		return placeofincident;
	}

	public void setPlaceofincident(String placeofincident) {
		this.placeofincident = placeofincident;
	}

	public Claimtypes getClaimtype() {
		return claimtype;
	}

	public void setClaimtype(Claimtypes claimtype) {
		this.claimtype = claimtype;
	}
	
	
	
	
	
	
	

}
