package com.CRBProjectt.CRBProjectt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class CollateralInformation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "collateralExpiryDate", nullable = false)
	private String collateralExpiryDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	@Column(name = "collateralLastValuationDate", nullable = false)
	private String collateralLastValuationDate;
	
//	@Column(name = "collateralType", nullable = false)
//	private String collateralType;
	
	@Enumerated(EnumType.STRING)
	private CollateralType collateralType;
	
	@Column(name = "collateralValue", nullable = false)
	private String collateralValue;
	
	
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
	public String getCollateralExpiryDate() {
		return collateralExpiryDate;
	}
	public void setCollateralExpiryDate(String collateralExpiryDate) {
		this.collateralExpiryDate = collateralExpiryDate;
	}
	public String getCollateralLastValuationDate() {
		return collateralLastValuationDate;
	}
	public void setCollateralLastValuationDate(String collateralLastValuationDate) {
		this.collateralLastValuationDate = collateralLastValuationDate;
	}
	
	public CollateralType getCollateralType() {
		return collateralType;
	}
	public void setCollateralType(CollateralType collateralType) {
		this.collateralType = collateralType;
	}
	public String getCollateralValue() {
		return collateralValue;
	}
	public void setCollateralValue(String collateralValue) {
		this.collateralValue = collateralValue;
	}
	
	
	
	
	
	
	

}
