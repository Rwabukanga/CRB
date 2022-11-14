package com.CRBProjectt.CRBProjectt.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Shareholder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String accountnumber;
	
	@Enumerated(EnumType.STRING)
	private ShareholderTypes shareholder;
	
	private String percentageofshares;
	
	private String Surname;
	
	private String Forename1;
	
	private String Forename2;
	
	private String Forename3;
	
	private String nationalid;
	
	private String passportno;
	
	private String nationality;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date datofbirth;
	
	private String placeofbirth;
	
	private String postaladdressline1number;
	
	private String postaladdressline1postalcode;
	
	private String town;
	
	@ManyToOne
	private Country countryid;
	
	private String institutionname;
	
	private String tradingname;
	
	private String companyregno;
	
	@JsonFormat(pattern="yyyyMMdd")
	private Date companyregistrationdate;
	
	private String postaladdressline1;
	
	private String numberofshares;
	
	

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public ShareholderTypes getShareholder() {
		return shareholder;
	}

	public void setShareholder(ShareholderTypes shareholder) {
		this.shareholder = shareholder;
	}

	public String getPercentageofshares() {
		return percentageofshares;
	}

	public void setPercentageofshares(String percentageofshares) {
		this.percentageofshares = percentageofshares;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getForename1() {
		return Forename1;
	}

	public void setForename1(String forename1) {
		Forename1 = forename1;
	}

	public String getForename2() {
		return Forename2;
	}

	public void setForename2(String forename2) {
		Forename2 = forename2;
	}

	public String getForename3() {
		return Forename3;
	}

	public void setForename3(String forename3) {
		Forename3 = forename3;
	}

	public String getNationalid() {
		return nationalid;
	}

	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}

	public String getPassportno() {
		return passportno;
	}

	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDatofbirth() {
		return datofbirth;
	}

	public void setDatofbirth(Date datofbirth) {
		this.datofbirth = datofbirth;
	}

	public String getPlaceofbirth() {
		return placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public String getPostaladdressline1number() {
		return postaladdressline1number;
	}

	public void setPostaladdressline1number(String postaladdressline1number) {
		this.postaladdressline1number = postaladdressline1number;
	}

	public String getPostaladdressline1postalcode() {
		return postaladdressline1postalcode;
	}

	public void setPostaladdressline1postalcode(String postaladdressline1postalcode) {
		this.postaladdressline1postalcode = postaladdressline1postalcode;
	}

	

	public Country getCountryid() {
		return countryid;
	}

	public void setCountryid(Country countryid) {
		this.countryid = countryid;
	}

	public String getInstitutionname() {
		return institutionname;
	}

	public void setInstitutionname(String institutionname) {
		this.institutionname = institutionname;
	}

	public String getTradingname() {
		return tradingname;
	}

	public void setTradingname(String tradingname) {
		this.tradingname = tradingname;
	}

	public String getCompanyregno() {
		return companyregno;
	}

	public void setCompanyregno(String companyregno) {
		this.companyregno = companyregno;
	}

	public Date getCompanyregistrationdate() {
		return companyregistrationdate;
	}

	public void setCompanyregistrationdate(Date companyregistrationdate) {
		this.companyregistrationdate = companyregistrationdate;
	}

	public String getPostaladdressline1() {
		return postaladdressline1;
	}

	public void setPostaladdressline1(String postaladdressline1) {
		this.postaladdressline1 = postaladdressline1;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getNumberofshares() {
		return numberofshares;
	}

	public void setNumberofshares(String numberofshares) {
		this.numberofshares = numberofshares;
	}
	
	
	

}
