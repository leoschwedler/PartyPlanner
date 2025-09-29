package com.schwedlermobile.PartyPlanner.infra.request;


public record UserRegisterRequestDto(
        String name,
        String email,
        String password
){
}
