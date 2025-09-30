package com.schwedlermobile.PartyPlanner.infra.presentation;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.usecases.party.CreatePartyUseCase;
import com.schwedlermobile.PartyPlanner.infra.mapper.PartyCreateMapper;
import com.schwedlermobile.PartyPlanner.infra.request.party.PartyCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("partyPlanner/")
@RequiredArgsConstructor
public class PartyController {

    CreatePartyUseCase createPartyUseCase;

    @PostMapping("create")
    public ResponseEntity<HashMap<String, Object>> create(@RequestBody PartyCreateRequest request){
        Party party = createPartyUseCase.execute(PartyCreateMapper.toDomain(request));
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Party created successfully.");
        response.put("data", PartyCreateMapper.toResponse(party));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
