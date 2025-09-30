package com.schwedlermobile.PartyPlanner.core.gateway;


import com.schwedlermobile.PartyPlanner.core.domain.model.Party;


public interface PartyGateway {

    public Party create(Party party);
}
