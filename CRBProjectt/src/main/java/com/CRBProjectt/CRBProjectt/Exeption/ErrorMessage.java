package com.CRBProjectt.CRBProjectt.Exeption;

import java.util.Date;

public class ErrorMessage {

	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;
	
	
	public static int InvalidNationalId=602;
	  public static int InvalidDocumentType=604;
	  public static int InvalidName=605;
	  public static int InvalidDOB=606;
	  public static int InvalidGender=607;
	  public static int InvalidPrincipalAmount=608;
	  public static int InvalidLoanBalance=609;
	  public static int InvalidDisbursementDate=610;
	  public static int InvalidMaturityDate=611;
	  public static int InvalidDaysinArrears=612;
	  public static int InvalidAccountStatus=614;
	  public static int InvalidClassification=615;
	  public static int InvalidAccountProductType=616;
	  public static int InvalidLoanAccount=618;
	  public static int InvalidIdentificationNumber=619;
	  public static int InvalidCurrency=621;
	  
	  public static int AccessDenied=106;
	  public static int Success=200;
	  public static int Unauthorized=401;
	  public static int GeneralApplicationError=403;
	  public static int ServiceUnavailable=404;
	  public static int InvalidJsonforrecordtype=597;
	  public static int IPAddressnotinlistofallowedIPAddresses=598;
	  public static int UnsupportedRecordType=599;
	  public static int Failedvalidationrecordhasvalidationerrors=600;
	  

	  public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
	    this.statusCode = statusCode;
	    this.timestamp = timestamp;
	    this.message = message;
	    this.description = description;
	  }

	  public int getStatusCode() {
	    return statusCode;
	  }

	  public Date getTimestamp() {
	    return timestamp;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public String getDescription() {
	    return description;
	  }
}
