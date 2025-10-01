package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;

public interface GetPartyByNameUseCase {

    public Party execute(String name);
}
