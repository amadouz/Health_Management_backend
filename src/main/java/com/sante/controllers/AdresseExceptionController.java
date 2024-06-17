package com.sante.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.sante.exception.AdresseNotFoundException;

@ControllerAdvice
public class AdresseExceptionController {
	@ExceptionHandler(value = AdresseNotFoundException.class)
	public ResponseEntity<Object> exception(AdresseNotFoundException exception, WebRequest request){
		return new ResponseEntity<>("l'adressse n'est pas trouvée", HttpStatus.NOT_FOUND);
	}
}
