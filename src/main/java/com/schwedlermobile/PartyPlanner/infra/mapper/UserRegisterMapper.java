package com.schwedlermobile.PartyPlanner.infra.mapper;

import com.schwedlermobile.PartyPlanner.infra.persistence.entity.UserEntity;

import com.schwedlermobile.PartyPlanner.infra.request.UserRegisterRequestDto;

import com.schwedlermobile.PartyPlanner.infra.response.UserRegisterResponseDto;
import lombok.experimental.UtilityClass;


@UtilityClass
public class UserRegisterMapper {

    public static UserEntity map(UserRegisterRequestDto request){
        return UserEntity.builder()
                .email(request.email())
                .name(request.password())
                .password(request.password())
                .build();
    }


    public static UserRegisterResponseDto map(UserEntity user){
        return UserRegisterResponseDto.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }


}
