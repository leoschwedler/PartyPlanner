package com.schwedlermobile.PartyPlanner.infra.response.user;

import lombok.Builder;

@Builder
public record UserLoginResponseDTO(String token) {
}