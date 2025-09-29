package com.schwedlermobile.PartyPlanner.infra.response;

import lombok.Builder;

@Builder
public record UserLoginResponseDTO(String token) {
}