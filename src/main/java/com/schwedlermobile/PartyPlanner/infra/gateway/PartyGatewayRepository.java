package com.schwedlermobile.PartyPlanner.infra.gateway;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;
import com.schwedlermobile.PartyPlanner.infra.mapper.PartyCreateMapper;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.PartyEntity;
import com.schwedlermobile.PartyPlanner.infra.persistence.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PartyGatewayRepository implements PartyGateway {

    private final PartyRepository repository;

    @Override
    public Party create(Party party) {
        PartyEntity partyEntity = PartyCreateMapper.toEntity(party);
        partyEntity = repository.save(partyEntity);
        return PartyCreateMapper.EntityToDomain(partyEntity);
    }
}
