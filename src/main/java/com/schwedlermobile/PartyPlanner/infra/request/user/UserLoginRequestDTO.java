package com.schwedlermobile.PartyPlanner.infra.request.user;

import lombok.Builder;

@Builder
public record UserLoginRequestDTO(String email, String password) {
}