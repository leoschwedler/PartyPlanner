package com.schwedlermobile.PartyPlanner.infra.gateway;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;
import com.schwedlermobile.PartyPlanner.infra.mapper.PartyMapper;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.PartyEntity;
import com.schwedlermobile.PartyPlanner.infra.persistence.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
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

    @Cacheable(value = "parties")
    @Override
    public List<Party> getAllParties() {
        List<PartyEntity>  parties = repository.findAll();
        return parties.stream().map(PartyMapper::EntityToDomain).collect(Collectors.toList());
    }

    @Cacheable(value = "party", key = "#name")
    @Override
    public Optional<Party> getPartyByName(String name) {
        Optional<PartyEntity> party = repository.findByName(name);
        return party.map(PartyMapper::EntityToDomain);
    }

    @Override
    public Boolean existForName(String name) {
        return repository.findAll().stream().anyMatch(
                party -> party.getName().equalsIgnoreCase(name)
        );
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public Optional<Party> findById(Long id) {
        Optional<PartyEntity> party = repository.findById(id);
        return party.map(PartyMapper::EntityToDomain);
    }

    @Override
    public void deleteParty(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Party save(Party party) {
        PartyEntity partyEntity = PartyMapper.toEntity(party);
        partyEntity = repository.save(partyEntity);
        return PartyMapper.EntityToDomain(partyEntity);
    }

}
