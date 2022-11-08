package com.CRBProjectt.CRBProjectt.Exeption;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.CRBProjectt.CRBProjectt.Utility.Messages;





@ControllerAdvice
public class ValidationExceptionHandler {
	
	
	 @ExceptionHandler(ResourceNotFoundException.class)
	  public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        HttpStatus.NOT_FOUND.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	  }

	 @ExceptionHandler(Exception.class)
	  public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        HttpStatus.INTERNAL_SERVER_ERROR.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	 
	 
	 @ExceptionHandler(EmailDuplicateException.class)
	  public ResponseEntity<ErrorMessage> emailduplicateFoundException(EmailDuplicateException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        HttpStatus.IM_USED.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.IM_USED);
	  }
	 
	 @ExceptionHandler(NationalIdException.class)
	  public ResponseEntity<ErrorMessage> NationalIdException(NationalIdException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidNationalId,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(AccountProductTypeException.class)
	  public ResponseEntity<ErrorMessage> AccountProductTypeException(AccountProductTypeException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidAccountProductType,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(AccountStatusException.class)
	  public ResponseEntity<ErrorMessage> AccountStatusException(AccountStatusException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidAccountStatus,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(ClassificationException.class)
	  public ResponseEntity<ErrorMessage> ClassificationException(ClassificationException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidClassification,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 
	 @ExceptionHandler(CurrencyException.class)
	  public ResponseEntity<ErrorMessage> CurrencyException(CurrencyException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidCurrency,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 
	 @ExceptionHandler(DaysinArrearsException.class)
	  public ResponseEntity<ErrorMessage> DaysinArrearsException(DaysinArrearsException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidDaysinArrears,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(DisbursementDateException.class)
	  public ResponseEntity<ErrorMessage> DisbursementDateException(DisbursementDateException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidDisbursementDate,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(DOBException.class)
	  public ResponseEntity<ErrorMessage> DOBException(DOBException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidDOB,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(DocumentTypeException.class)
	  public ResponseEntity<ErrorMessage> DocumentTypeException(DocumentTypeException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidDocumentType,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 
	 @ExceptionHandler(GenderException.class)
	  public ResponseEntity<ErrorMessage> GenderException(GenderException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidGender,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(LoanAccountException.class)
	  public ResponseEntity<ErrorMessage> LoanAccountException(LoanAccountException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidLoanAccount,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(LoanBalanceException.class)
	  public ResponseEntity<ErrorMessage> LoanBalanceException(LoanBalanceException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidLoanBalance,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(MaturityDateException.class)
	  public ResponseEntity<ErrorMessage> MaturityDateException(MaturityDateException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidMaturityDate,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 
	 @ExceptionHandler(NameException.class)
	  public ResponseEntity<ErrorMessage> NameException(NameException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidName,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(PrincipalAmountException.class)
	  public ResponseEntity<ErrorMessage> PrincipalAmountException(PrincipalAmountException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.InvalidPrincipalAmount,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
	  }
	 
	 @ExceptionHandler(Unauthorized.class)
	  public ResponseEntity<ErrorMessage> Unauthorized(Unauthorized ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	    	ErrorMessage.Unauthorized,
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.UNAUTHORIZED);
	  }
	 
	 
	 
	 

}
