package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.exceptions.IdNotFoundException;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public class UpdatePartyUseCaseImpl implements UpdatePartyUseCase{

    private final PartyGateway gateway;

    public UpdatePartyUseCaseImpl(PartyGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Party execute(Long id, Party party) {
       Party existingParty = gateway.findById(id).orElseThrow( () -> new IdNotFoundException("Party with ID \" + id + \" not found."));
        existingParty.setName(party.getName());
        existingParty.setDescription(party.getDescription());
        existingParty.setLocation(party.getLocation());
        existingParty.setDate_party(party.getDate_party());
        existingParty.setCapacity(party.getCapacity());
        existingParty.setTypeParty(party.getTypeParty());
        return gateway.save(existingParty);
    }
}
