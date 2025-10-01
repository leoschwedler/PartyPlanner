package com.schwedlermobile.PartyPlanner.core.gateway;


import com.schwedlermobile.PartyPlanner.core.domain.model.Party;

import java.util.List;
import java.util.Optional;


public interface PartyGateway {

    public Party create(Party party);

    public List<Party> getAllParties();

    public Optional<Party> getPartyByName(String name);

    public Boolean existForName(String name);
}
