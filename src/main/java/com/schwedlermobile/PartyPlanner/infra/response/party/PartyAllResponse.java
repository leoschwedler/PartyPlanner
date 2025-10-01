package com.schwedlermobile.PartyPlanner.infra.response.party;

import com.schwedlermobile.PartyPlanner.core.domain.enums.TypeParty;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
public record PartyAllResponse (
         Long id,
        String name,
        String description,
        String location,
        LocalDateTime date_party,
        Integer capacity,
        TypeParty typeParty
) {
}
