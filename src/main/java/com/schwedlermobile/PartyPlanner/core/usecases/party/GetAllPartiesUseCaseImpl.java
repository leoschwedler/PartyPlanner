package com.schwedlermobile.PartyPlanner.core.usecases.party;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public class GetAllPartiesUseCaseImpl implements GetAllPartiesUseCase{

    private final PartyGateway gateway;

    public GetAllPartiesUseCaseImpl(PartyGateway gateway) {
        this.gateway = gateway;
    }



    @Override
    public List<Party> execute() {
        return gateway.getAllParties();
    }
}
