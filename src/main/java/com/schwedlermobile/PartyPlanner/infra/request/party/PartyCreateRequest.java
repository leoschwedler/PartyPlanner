package com.schwedlermobile.PartyPlanner.infra.request.party;

import com.schwedlermobile.PartyPlanner.core.domain.enums.TypeParty;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record PartyCreateRequest (
        String name,
        String description,
        String location,
        LocalDateTime date_party,
        Integer capacity,
        TypeParty typeParty
){
}
