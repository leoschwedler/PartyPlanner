package com.schwedlermobile.PartyPlanner.infra.gateway;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;
import com.schwedlermobile.PartyPlanner.infra.mapper.PartyMapper;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.PartyEntity;
import com.schwedlermobile.PartyPlanner.infra.persistence.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PartyGatewayRepository implements PartyGateway {

    private final PartyRepository repository;

    @Override
    public Party create(Party party) {
        PartyEntity partyEntity = PartyMapper.toEntity(party);
        partyEntity = repository.save(partyEntity);
        return PartyMapper.EntityToDomain(partyEntity);
    }

    @Override
    public List<Party> getAllParties() {
        List<PartyEntity>  parties = repository.findAll();
        return parties.stream().map(PartyMapper::EntityToDomain).collect(Collectors.toList());
    }
}
