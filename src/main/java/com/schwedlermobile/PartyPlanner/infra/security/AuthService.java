package com.schwedlermobile.PartyPlanner.infra.security;

import com.schwedlermobile.PartyPlanner.infra.mapper.UserMapper;
import com.schwedlermobile.PartyPlanner.infra.persistence.entity.UserEntity;
import com.schwedlermobile.PartyPlanner.infra.persistence.repository.UserRepository;
import com.schwedlermobile.PartyPlanner.infra.request.user.UserLoginRequestDTO;
import com.schwedlermobile.PartyPlanner.infra.request.user.UserRegisterRequestDto;
import com.schwedlermobile.PartyPlanner.infra.response.user.UserLoginResponseDTO;
import com.schwedlermobile.PartyPlanner.infra.response.user.UserRegisterResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    public UserRegisterResponseDto register(UserRegisterRequestDto request){
        String password = request.password();
        UserEntity user = UserMapper.map(request);
        user.setPassword(passwordEncoder.encode(password));
        user = repository.save(user);
        return UserMapper.map(user);
    }

    public UserLoginResponseDTO login(UserLoginRequestDTO request){
        UsernamePasswordAuthenticationToken userAndPassword = new UsernamePasswordAuthenticationToken(request.email(), request.password());
        Authentication authenticated = authenticationManager.authenticate(userAndPassword);
        UserEntity user = (UserEntity) authenticated.getPrincipal();
        String token = tokenService.generateToken(user);
        return new UserLoginResponseDTO(token);
    }
}
