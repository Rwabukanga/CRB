package com.CRBProjectt.CRBProjectt.Exeption;

public class EmailDuplicateException extends RuntimeException {

	 private static final long serialVersionUID = 1L;

	  public EmailDuplicateException(String msg) {
	    super(msg);
	  }
}
