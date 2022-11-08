package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Director {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
	@ManyToOne
	@JoinColumn(name="countryid")
	private Country countryid;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateAppointed", nullable = false)
	private Date dateAppointed;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "dateOfBirth", nullable = false)
	private Date dateOfBirth;
	
	@Column(name = "foreName1", nullable = false)
	private String foreName1;
	
	@Column(name = "foreName2", nullable = false)
	private String foreName2;
	
	@Column(name = "foreName3", nullable = false)
	private String foreName3;
	
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
	
//	@Column(name = "salutation", nullable = false)
//	private String salutation;
	
	@Enumerated(EnumType.STRING)
	private Salutation salutation;
	
	@Column(name = "surName", nullable = false)
	private String surName;
	
	@Column(name = "town", nullable = false)
	private String town;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Country getCountryid() {
		return countryid;
	}

	public void setCountryid(Country countryid) {
		this.countryid = countryid;
	}
	public Date getDateAppointed() {
		return dateAppointed;
	}

	public void setDateAppointed(Date dateAppointed) {
		this.dateAppointed = dateAppointed;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getForeName1() {
		return foreName1;
	}

	public void setForeName1(String foreName1) {
		this.foreName1 = foreName1;
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

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Salutation getSalutation() {
		return salutation;
	}

	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
	}

	

	
	
	
}
