package com.schwedlermobile.PartyPlanner.infra.request.user;


public record UserRegisterRequestDto(
        String name,
        String email,
        String password
){
}
