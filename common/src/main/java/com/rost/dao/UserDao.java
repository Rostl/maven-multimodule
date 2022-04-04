package com.rost.dao;


import com.rost.entity.UserEntity;

import java.util.Optional;

public class UserDao {

    public Optional<UserEntity>getUserById(long id){
        return Optional.ofNullable(UserEntity.builder()
                .id(id)
                .firstName("Ivan")
                .patronymicName("Ivanovich")
                .lastName("Ivanov")
                .age(22)
                .email("ivan@gmail.com")
                .build());
    }
}