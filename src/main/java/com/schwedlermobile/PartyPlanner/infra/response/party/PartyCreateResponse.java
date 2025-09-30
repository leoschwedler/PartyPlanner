package com.schwedlermobile.PartyPlanner.infra.response.party;

import com.schwedlermobile.PartyPlanner.core.domain.enums.TypeParty;
import lombok.Builder;

import java.time.LocalDateTime;
@Builder
public record PartyCreateResponse (
        String name,
        String description,
        String location,
        LocalDateTime date_party,
        Integer capacity,
        TypeParty typeParty
){
}
