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
public class Transportclaims {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "policynumber", nullable = false)
	private String policynumber;
	
	@Enumerated(EnumType.STRING)
	private PolicyCover policycover;
	
	@Column(name = "claimnumber", nullable = false)
	private String claimnumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "claimdeclarationdate", nullable = false)
	private Date claimdeclarationdate;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claimstatus;
	
	@Column(name = "rejectionreason", nullable = false)
	private String rejectionreason;
	
	@Column(name = "amountofclaimreserve", nullable = false)
	private double amountofclaimreserve;
	
	@Column(name = "dateofpaymentoflastpremium", nullable = false)
	private Date dateofpaymentoflastpremium;
	
	@Column(name = "amountpaid", nullable = false)
	private double amountpaid;
	
	@Column(name = "lossadjuster", nullable = false)
	private String lossadjuster;
	
	@Column(name = "lossAdjusternumber", nullable = false)
	private String lossAdjusternumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "claimsettlementdate", nullable = false)
	private Date claimsettlementdate;
	
	@Column(name = "descriptionofgoods", nullable = false)
	private String descriptionofgoods;
	
	@Column(name = "damagesdescription", nullable = false)
	private String damagesdescription;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "incidentdate", nullable = false)
	private Date incidentdate;
	
	@Column(name = "placeofincident", nullable = false)
	private String placeofincident;

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

	public PolicyCover getPolicycover() {
		return policycover;
	}

	public void setPolicycover(PolicyCover policycover) {
		this.policycover = policycover;
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

	public double getAmountofclaimreserve() {
		return amountofclaimreserve;
	}

	public void setAmountofclaimreserve(double amountofclaimreserve) {
		this.amountofclaimreserve = amountofclaimreserve;
	}

	public Date getDateofpaymentoflastpremium() {
		return dateofpaymentoflastpremium;
	}

	public void setDateofpaymentoflastpremium(Date dateofpaymentoflastpremium) {
		this.dateofpaymentoflastpremium = dateofpaymentoflastpremium;
	}

	public double getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public String getLossadjuster() {
		return lossadjuster;
	}

	public void setLossadjuster(String lossadjuster) {
		this.lossadjuster = lossadjuster;
	}

	public String getLossAdjusternumber() {
		return lossAdjusternumber;
	}

	public void setLossAdjusternumber(String lossAdjusternumber) {
		this.lossAdjusternumber = lossAdjusternumber;
	}
	public String getDescriptionofgoods() {
		return descriptionofgoods;
	}

	public void setDescriptionofgoods(String descriptionofgoods) {
		this.descriptionofgoods = descriptionofgoods;
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

	public Date getClaimsettlementdate() {
		return claimsettlementdate;
	}

	public void setClaimsettlementdate(Date claimsettlementdate) {
		this.claimsettlementdate = claimsettlementdate;
	}

	

	
	
	
}
