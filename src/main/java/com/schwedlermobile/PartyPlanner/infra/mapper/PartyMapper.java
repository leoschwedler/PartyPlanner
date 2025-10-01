package com.schwedlermobile.PartyPlanner.infra.mapper;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.PartyEntity;
import com.schwedlermobile.PartyPlanner.infra.request.party.PartyCreateRequest;
import com.schwedlermobile.PartyPlanner.infra.response.party.PartyAllResponse;
import com.schwedlermobile.PartyPlanner.infra.response.party.PartyCreateResponse;
import com.schwedlermobile.PartyPlanner.infra.response.party.PartyGetByNameResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PartyMapper {

    public PartyEntity toEntity(Party party){
        return PartyEntity.builder()
                .id(party.getId())
                .name(party.getName())
                .description(party.getDescription())
                .location(party.getLocation())
                .dateParty(party.getDate_party())
                .capacity(party.getCapacity())
                .typeParty(party.getTypeParty())
                .build();
    }

    public Party EntityToDomain(PartyEntity partyEntity){
        Party party = new Party();
        party.setId(partyEntity.getId());
        party.setName(partyEntity.getName());
        party.setDescription(partyEntity.getDescription());
        party.setLocation(partyEntity.getLocation());
        party.setDate_party(partyEntity.getDateParty());
        party.setCapacity(partyEntity.getCapacity());
        party.setTypeParty(partyEntity.getTypeParty());
        return party;
    }


    public Party toDomain(PartyCreateRequest request){
        Party party = new Party();
        party.setName(request.name());
        party.setDescription(request.description());
        party.setLocation(request.location());
        party.setDate_party(request.date_party());
        party.setCapacity(request.capacity());
        party.setTypeParty(request.typeParty());
        return party;
    }

    public PartyCreateResponse toResponse(Party party){
        return PartyCreateResponse.builder()
                .name(party.getName())
                .description(party.getDescription())
                .location(party.getLocation())
                .date_party(party.getDate_party())
                .capacity(party.getCapacity())
                .typeParty(party.getTypeParty())
                .build();
    }

    public PartyAllResponse domainToResponseAll(Party party){
        return PartyAllResponse.builder()
                .id(party.getId())
                .name(party.getName())
                .description(party.getDescription())
                .location(party.getLocation())
                .date_party(party.getDate_party())
                .capacity(party.getCapacity())
                .typeParty(party.getTypeParty())
                .build();
    }

    public PartyGetByNameResponse domainToResponseGetByName(Party party){
        return PartyGetByNameResponse.builder()
                .id(party.getId())
                .name(party.getName())
                .description(party.getDescription())
                .location(party.getLocation())
                .date_party(party.getDate_party())
                .capacity(party.getCapacity())
                .typeParty(party.getTypeParty())
                .build();
    }
}
