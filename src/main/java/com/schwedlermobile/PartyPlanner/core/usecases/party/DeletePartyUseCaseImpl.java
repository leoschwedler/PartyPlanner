package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.exceptions.IdNotFoundException;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public class DeletePartyUseCaseImpl implements DeletePartyUseCase{

    private final PartyGateway gateway;

    public DeletePartyUseCaseImpl(PartyGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void execute(Long id) {
       if (gateway.existsById(id)){
           gateway.deleteParty(id);
       }else {
           throw new IdNotFoundException("Party with ID " + id + " not found.");
       }
    }
}
