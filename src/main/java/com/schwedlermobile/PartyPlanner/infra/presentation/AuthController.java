package com.schwedlermobile.PartyPlanner.infra.presentation;

import com.schwedlermobile.PartyPlanner.infra.request.UserLoginRequestDTO;
import com.schwedlermobile.PartyPlanner.infra.request.UserRegisterRequestDto;
import com.schwedlermobile.PartyPlanner.infra.response.UserLoginResponseDTO;
import com.schwedlermobile.PartyPlanner.infra.response.UserRegisterResponseDto;
import com.schwedlermobile.PartyPlanner.infra.security.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
@RequestMapping("auth/")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("register")
    public ResponseEntity<HashMap<String, Object>> register(@RequestBody UserRegisterRequestDto request){
        UserRegisterResponseDto user = service.register(request);
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Player created successfully.");
        response.put("description", "The player has been saved in the database and is now available for retrieval.");
        response.put("data", user);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("login")
    public ResponseEntity<HashMap<String, Object>> login(@RequestBody UserLoginRequestDTO request) {
        UserLoginResponseDTO token = service.login(request);
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Login successful.");
        response.put("description", "Authentication completed successfully. Use the returned token for future requests.");
        response.put("token", token);
        return ResponseEntity.ok(response);
    }
}