package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.exceptions.NameAlreadyExistsException;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public class CreatePartyUseCaseImpl implements CreatePartyUseCase{

    private final PartyGateway gateway;

    public CreatePartyUseCaseImpl(PartyGateway partyGateway) {
        this.gateway = partyGateway;
    }

    @Override
    public Party execute(Party party) {
        if (!gateway.existForName(party.getName())){
            return gateway.create(party);
        }else {
            throw new NameAlreadyExistsException("A player with this name already exists");
        }
    }
}
