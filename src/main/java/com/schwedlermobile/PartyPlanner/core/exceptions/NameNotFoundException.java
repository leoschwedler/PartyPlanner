package com.schwedlermobile.PartyPlanner.core.exceptions;

public class NameNotFoundException extends RuntimeException{

    public NameNotFoundException(String name){
        super(name);
    }
}
