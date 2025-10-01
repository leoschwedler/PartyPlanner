package com.schwedlermobile.PartyPlanner.core.gateway;


import com.schwedlermobile.PartyPlanner.core.domain.model.Party;

import java.util.List;


public interface PartyGateway {

    public Party create(Party party);

    public List<Party> getAllParties();
}
