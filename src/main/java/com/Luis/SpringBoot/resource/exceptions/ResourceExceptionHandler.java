package com.Luis.SpringBoot.resource.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Luis.SpringBoot.services.excepitions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //@ControllerAdvice intercepta as exeçoes para que a classe possa tarta-las
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class) 
	// O metodo abaixo ira interceptar qualquer execao do tipo-
	// -ResourceNotFoundException e ira trata-la conforme implementadp
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
