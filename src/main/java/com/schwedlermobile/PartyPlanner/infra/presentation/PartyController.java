package com.schwedlermobile.PartyPlanner.infra.presentation;

import com.schwedlermobile.PartyPlanner.core.domain.model.Party;
import com.schwedlermobile.PartyPlanner.core.usecases.party.CreatePartyUseCase;
import com.schwedlermobile.PartyPlanner.core.usecases.party.GetAllPartiesUseCase;
import com.schwedlermobile.PartyPlanner.core.usecases.party.GetPartyByNameUseCase;
import com.schwedlermobile.PartyPlanner.infra.mapper.PartyMapper;
import com.schwedlermobile.PartyPlanner.infra.request.party.PartyCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("party/")
@RequiredArgsConstructor
public class PartyController {

    private final CreatePartyUseCase createPartyUseCase;
    private final GetAllPartiesUseCase getAllPartiesUseCase;
    private final GetPartyByNameUseCase getPartyByNameUseCase;

    @PostMapping("create")
    public ResponseEntity<HashMap<String, Object>> create(@RequestBody PartyCreateRequest request){
        Party party = createPartyUseCase.execute(PartyMapper.toDomain(request));
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Party created successfully.");
        response.put("data", PartyMapper.toResponse(party));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @GetMapping("all")
    public ResponseEntity<HashMap<String, Object>> getAllParties(){
        List<Party> party = getAllPartiesUseCase.execute();
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Parties retrieved successfully.");
        response.put("data", party.stream().map(PartyMapper::domainToResponseAll).collect(Collectors.toList()));
        return ResponseEntity.ok(response);
    }

    @GetMapping("findByName/{name}")
    public ResponseEntity<HashMap<String, Object>> getPartyByName(@PathVariable String name){
        Party party = getPartyByNameUseCase.execute(name);
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Party retrieved successfully.");
        response.put("data", PartyMapper.domainToResponseGetByName(party));
        return ResponseEntity.ok(response);
    }
}
