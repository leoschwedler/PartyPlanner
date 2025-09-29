package com.schwedlermobile.PartyPlanner.infra.request;

import lombok.Builder;

@Builder
public record UserLoginRequestDTO(String email, String password) {
}