package com.rost.mapper;

import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;

public class UserEntityToUserDtoMapper {

    public UserDto map(UserEntity user) {
      return UserDto.builder()
              .fullName(getFullUserName(user))
              .age(user.getAge())
              .email(user.getEmail())
              .build();
    }

    private String getFullUserName(UserEntity user) {
        return user.getLastName().concat(user.getFirstName()).concat(user.getPatronymicName());
    }
}