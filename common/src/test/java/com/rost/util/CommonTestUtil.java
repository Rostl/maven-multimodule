package com.rost.util;

import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class CommonTestUtil {

    public static Optional<UserEntity> userEntityBuilder() {
        return Optional.ofNullable(UserEntity.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .patronymicName("Ivanovich")
                .age(22)
                .email("ivan@gmail.com")
                .build());
    }

    public static UserDto userDtoBuilder() {
        return UserDto.builder()
                .fullName("IvanovIvanIvanovich")
                .age(22)
                .email("ivan@gmail.com")
                .build();
    }
}