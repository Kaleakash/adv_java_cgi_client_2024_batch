package com.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> dividedBy(ArithmeticException exp){
		return ResponseEntity.status(500).body("Divided by Zero generated "+exp);
	}
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<String> arrayIndex(ArrayIndexOutOfBoundsException exp){
		return ResponseEntity.status(500).body("Array Index out of bound generated "+exp);
	}
	
	
	@ExceptionHandler(EmployeeSalaryConditionException.class)
	public ResponseEntity<String> employeeSalaryExceptionHandler(EmployeeSalaryConditionException exp){
		return ResponseEntity.status(500).body("Custom Salary exception generated "+exp);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> genericExceptionHandler(Exception exp){
		return ResponseEntity.status(500).body("Generic Exception generated "+exp);
	}
}
