package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public class CreatePartyUseCaseImpl implements CreatePartyUseCase{

    private final PartyGateway gateway;

    public CreatePartyUseCaseImpl(PartyGateway partyGateway) {
        this.gateway = partyGateway;
    }

    @Override
    public Party execute(Party party) {
        return gateway.create(party);
    }
}
