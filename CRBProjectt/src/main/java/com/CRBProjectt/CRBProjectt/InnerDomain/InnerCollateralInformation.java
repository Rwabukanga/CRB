package com.CRBProjectt.CRBProjectt.InnerDomain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.CRBProjectt.CRBProjectt.domain.CollateralType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InnerCollateralInformation {

	
	
	private String accountNumber;
	
	@JsonFormat(pattern="yyyyMMdd")
	private String collateralExpiryDate;
	
	@JsonFormat(pattern="yyyyMMdd")
	private String collateralLastValuationDate;
	
//	private String collateralType;
	
	@Enumerated(EnumType.STRING)
	private CollateralType collateralType;
	
	private String collateralValue;

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

	public String getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(String collateralValue) {
		this.collateralValue = collateralValue;
	}

	public CollateralType getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralType collateralType) {
		this.collateralType = collateralType;
	}
	
	
	
	
}
