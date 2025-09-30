package com.schwedlermobile.PartyPlanner.infra.response.user;

import lombok.Builder;

@Builder
public record UserRegisterResponseDto(
        String name,
        String email
){
}
