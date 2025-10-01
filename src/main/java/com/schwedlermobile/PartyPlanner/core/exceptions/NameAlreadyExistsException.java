package com.schwedlermobile.PartyPlanner.core.exceptions;

public class NameAlreadyExistsException extends RuntimeException{

    public NameAlreadyExistsException(String name){
        super(name);
    }
}
