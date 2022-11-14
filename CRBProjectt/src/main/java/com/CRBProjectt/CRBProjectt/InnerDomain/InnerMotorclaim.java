package com.CRBProjectt.CRBProjectt.InnerDomain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.ClaimStatus;
import com.CRBProjectt.CRBProjectt.domain.IdentificationdocumentType;
import com.CRBProjectt.CRBProjectt.domain.PolicyCover;
import com.CRBProjectt.CRBProjectt.domain.Trailer;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerMotorclaim {
	
	
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
	
	@Column(name = "numberofpersonsinvolved", nullable = false)
	private String numberofpersonsinvolved;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateofpaymentoflastpremium", nullable = false)
	private Date dateofpaymentoflastpremium;
	
	@Column(name = "amountofclaimreserve", nullable = false)
	private double amountofclaimreserve;
	
	@Column(name = "amountpaid", nullable = false)
	private double amountpaid;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "claimsettlementdate", nullable = false)
	private Date claimsettlementdate;
	
	@Column(name = "trailerregistrationnumber", nullable = false)
	private String trailerregistrationnumber;
	
	@Column(name = "vehiclechassisnumber", nullable = false)
	private String vehiclechassisnumber;
	
	@Column(name = "yearofmanufacture", nullable = false)
	private String yearofmanufacture;
	
	@Enumerated(EnumType.STRING)
	private Trailer trailer;
	
	@Column(name = "nameofpoliceofficer", nullable = false)
	private String nameofpoliceofficer;
	
	@Column(name = "nameofpolicestation", nullable = false)
	private String nameofpolicestation;
	
	@Column(name = "nameofassessor", nullable = false)
	private String nameofassessor;
	
	@Column(name = "assessorsidnumber", nullable = false)
	private String assessorsidnumber;
	
	@Column(name = "incidentdate", nullable = false)
	private Date incidentdate;
	
	@Column(name = "placeofincident", nullable = false)
	private String placeofincident;
	
	@Column(name = "surnameofdriver", nullable = false)
	private String surnameofdriver;
	
	@Column(name = "firstnameofthedriver", nullable = false)
	private String firstnameofthedriver;
	
	@Column(name = "drivinglicensenumber", nullable = false)
	private String drivinglicensenumber;
	
	@Enumerated(EnumType.STRING)
	private IdentificationdocumentType idtype;
	
	@Column(name = "identificationdocumentnumberfordriver", nullable = false)
	private String identificationdocumentnumberfordriver;

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

	public String getNumberofpersonsinvolved() {
		return numberofpersonsinvolved;
	}

	public void setNumberofpersonsinvolved(String numberofpersonsinvolved) {
		this.numberofpersonsinvolved = numberofpersonsinvolved;
	}

	public Date getDateofpaymentoflastpremium() {
		return dateofpaymentoflastpremium;
	}

	public void setDateofpaymentoflastpremium(Date dateofpaymentoflastpremium) {
		this.dateofpaymentoflastpremium = dateofpaymentoflastpremium;
	}

	public double getAmountofclaimreserve() {
		return amountofclaimreserve;
	}

	public void setAmountofclaimreserve(double amountofclaimreserve) {
		this.amountofclaimreserve = amountofclaimreserve;
	}

	public double getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public Date getClaimsettlementdate() {
		return claimsettlementdate;
	}

	public void setClaimsettlementdate(Date claimsettlementdate) {
		this.claimsettlementdate = claimsettlementdate;
	}

	public String getTrailerregistrationnumber() {
		return trailerregistrationnumber;
	}

	public void setTrailerregistrationnumber(String trailerregistrationnumber) {
		this.trailerregistrationnumber = trailerregistrationnumber;
	}

	public String getVehiclechassisnumber() {
		return vehiclechassisnumber;
	}

	public void setVehiclechassisnumber(String vehiclechassisnumber) {
		this.vehiclechassisnumber = vehiclechassisnumber;
	}

	public String getYearofmanufacture() {
		return yearofmanufacture;
	}

	public void setYearofmanufacture(String yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	public String getNameofpoliceofficer() {
		return nameofpoliceofficer;
	}

	public void setNameofpoliceofficer(String nameofpoliceofficer) {
		this.nameofpoliceofficer = nameofpoliceofficer;
	}

	public String getNameofpolicestation() {
		return nameofpolicestation;
	}

	public void setNameofpolicestation(String nameofpolicestation) {
		this.nameofpolicestation = nameofpolicestation;
	}

	public String getNameofassessor() {
		return nameofassessor;
	}

	public void setNameofassessor(String nameofassessor) {
		this.nameofassessor = nameofassessor;
	}

	public String getAssessorsidnumber() {
		return assessorsidnumber;
	}

	public void setAssessorsidnumber(String assessorsidnumber) {
		this.assessorsidnumber = assessorsidnumber;
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

	public String getSurnameofdriver() {
		return surnameofdriver;
	}

	public void setSurnameofdriver(String surnameofdriver) {
		this.surnameofdriver = surnameofdriver;
	}

	public String getFirstnameofthedriver() {
		return firstnameofthedriver;
	}

	public void setFirstnameofthedriver(String firstnameofthedriver) {
		this.firstnameofthedriver = firstnameofthedriver;
	}

	public String getDrivinglicensenumber() {
		return drivinglicensenumber;
	}

	public void setDrivinglicensenumber(String drivinglicensenumber) {
		this.drivinglicensenumber = drivinglicensenumber;
	}

	public IdentificationdocumentType getIdtype() {
		return idtype;
	}

	public void setIdtype(IdentificationdocumentType idtype) {
		this.idtype = idtype;
	}

	public String getIdentificationdocumentnumberfordriver() {
		return identificationdocumentnumberfordriver;
	}

	public void setIdentificationdocumentnumberfordriver(String identificationdocumentnumberfordriver) {
		this.identificationdocumentnumberfordriver = identificationdocumentnumberfordriver;
	}
	
	
	
	
	
	

}
