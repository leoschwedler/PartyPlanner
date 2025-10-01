package com.schwedlermobile.PartyPlanner.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(NameNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> nameNotFoundException(NameNotFoundException exception){
        HashMap<String, Object> response = new HashMap<>();
        response.put("Detail", exception.getMessage());
        response.put("Hint", "Please check the name is correct");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NameAlreadyExistsException.class)
    public ResponseEntity<HashMap<String, Object>> nameAlreadyExistsException(NameAlreadyExistsException exception){
        HashMap<String, Object> response = new HashMap<>();
        response.put("Detail", exception.getMessage());
        response.put("Hint", "Please choose a different name.");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> idNotFoundException(IdNotFoundException exception){
        HashMap<String, Object> response = new HashMap<>();
        response.put("Detail", exception.getMessage());
        response.put("Hint", "Please check the ID and try again");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }



}
