package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.exceptions.NameNotFoundException;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public class GetPartyByNameUseCaseImpl implements  GetPartyByNameUseCase{

    private final PartyGateway gateway;

    public GetPartyByNameUseCaseImpl(PartyGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Party execute(String name) {
        return gateway.getPartyByName(name).orElseThrow( () -> new NameNotFoundException("Player not found with the given name."));
    }
}
