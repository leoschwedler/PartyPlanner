package com.schwedlermobile.PartyPlanner.infra.beans;

import com.schwedlermobile.PartyPlanner.core.gateway.PartyGateway;
import com.schwedlermobile.PartyPlanner.core.usecases.party.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreatePartyUseCase createPartyUseCase(PartyGateway gateway){
        return new CreatePartyUseCaseImpl(gateway);
    }

    @Bean
    public GetAllPartiesUseCase GetAllPartiesUseCase(PartyGateway gateway){
        return new GetAllPartiesUseCaseImpl(gateway);
    }

    @Bean
    public GetPartyByNameUseCase GetPartyByNameUseCase(PartyGateway gateway){
        return new GetPartyByNameUseCaseImpl(gateway);
    }


}
