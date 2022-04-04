package com.rost.mapper;

import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserEntityToUserDtoMapper {

    public UserDto map(UserEntity user) {
      return UserDto.builder()
              .fullName(getFullUserName(user))
              .age(user.getAge())
              .email(user.getEmail())
              .build();
    }

    private String getFullUserName(UserEntity user) {
        return Stream.of(user.getLastName(), user.getFirstName(), user.getPatronymicName())
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }
}