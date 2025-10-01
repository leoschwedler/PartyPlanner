package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;

public interface UpdatePartyUseCase {

    public Party execute(Long id, Party party);
}
