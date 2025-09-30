package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;

public interface CreatePartyUseCase {




    public Party execute(Party party);
}
