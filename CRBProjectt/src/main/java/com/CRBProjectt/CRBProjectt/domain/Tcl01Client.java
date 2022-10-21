package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Tcl01Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String employerName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	private String drivingLicenseNumber;
	
	private String emailAddress;
	
	private String employerAddressLine1;
	
	private String employerAddressLine2;
	
	@ManyToOne
	private Country countryid;
	
	private String employerTown;
	
	@ManyToOne
	private Gender genderid;
	
	private String groupName;
	
	private String groupNumber;
	
	private String healthInsuranceNumber;
	
	private String homeTelephone;
	
	@ManyToOne
	private Tcl550MaritStatus maritstatusid;
	
	private String mobileTelephone;
	
	private String passportNumber;
	
	private String physicalAddressLine1;
	
	private String physicalAddressLine2;
	
	private String physicalAddressPlotNumber;
	
	private String physicalAddressPostalCode;
	
	private String placeOfBirth;
	
	private String postalAddressNumber;
	
	private String postalCode;
	
	private String residenceType;
	
	private String socialSecurityNumber;
	
	private String studentNumber;
	
	private String surName;
	
	private String workTelephone;
	
	@ManyToOne
	private Tcl554ASvillage villageid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmployerAddressLine1() {
		return employerAddressLine1;
	}

	public void setEmployerAddressLine1(String employerAddressLine1) {
		this.employerAddressLine1 = employerAddressLine1;
	}

	public String getEmployerAddressLine2() {
		return employerAddressLine2;
	}

	public void setEmployerAddressLine2(String employerAddressLine2) {
		this.employerAddressLine2 = employerAddressLine2;
	}

	public Country getCountryid() {
		return countryid;
	}

	public void setCountryid(Country countryid) {
		this.countryid = countryid;
	}

	public String getEmployerTown() {
		return employerTown;
	}

	public void setEmployerTown(String employerTown) {
		this.employerTown = employerTown;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getHealthInsuranceNumber() {
		return healthInsuranceNumber;
	}

	public void setHealthInsuranceNumber(String healthInsuranceNumber) {
		this.healthInsuranceNumber = healthInsuranceNumber;
	}

	public String getHomeTelephone() {
		return homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getMobileTelephone() {
		return mobileTelephone;
	}

	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}

	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}

	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}

	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}

	public String getPhysicalAddressPlotNumber() {
		return physicalAddressPlotNumber;
	}

	public void setPhysicalAddressPlotNumber(String physicalAddressPlotNumber) {
		this.physicalAddressPlotNumber = physicalAddressPlotNumber;
	}

	public String getPhysicalAddressPostalCode() {
		return physicalAddressPostalCode;
	}

	public void setPhysicalAddressPostalCode(String physicalAddressPostalCode) {
		this.physicalAddressPostalCode = physicalAddressPostalCode;
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

	public String getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getWorkTelephone() {
		return workTelephone;
	}

	public void setWorkTelephone(String workTelephone) {
		this.workTelephone = workTelephone;
	}

	public Gender getGenderid() {
		return genderid;
	}

	public void setGenderid(Gender genderid) {
		this.genderid = genderid;
	}

	public Tcl550MaritStatus getMaritstatusid() {
		return maritstatusid;
	}

	public void setMaritstatusid(Tcl550MaritStatus maritstatusid) {
		this.maritstatusid = maritstatusid;
	}

	public Tcl554ASvillage getVillageid() {
		return villageid;
	}

	public void setVillageid(Tcl554ASvillage villageid) {
		this.villageid = villageid;
	}

	
	
	
	
	
	
	
	

}
