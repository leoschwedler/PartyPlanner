package com.schwedlermobile.PartyPlanner.infra.response;

import lombok.Builder;

@Builder
public record UserRegisterResponseDto(
        String name,
        String email
){
}
