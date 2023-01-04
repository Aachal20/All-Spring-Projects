package com.nt.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice
public class StudentErrorHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleStudentNotFound(StudentNotFoundException snf){
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), snf.getMessage() , "404-Student Not Found");
		return new ResponseEntity<ErrorDetails>(details , HttpStatus.NOT_FOUND);
		
	}
	
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllProblemstFound(Exception snf){
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), snf.getMessage() , "Problem in execution");
		return new ResponseEntity<ErrorDetails>(details , HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
