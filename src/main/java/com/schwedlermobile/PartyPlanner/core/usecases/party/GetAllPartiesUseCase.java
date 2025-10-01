package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;

import java.util.List;

public interface GetAllPartiesUseCase {

    public List<Party> execute();
}
