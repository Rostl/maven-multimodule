package com.rost.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserEntity {

    private long id;
    private String firstName;
    private String lastName;
    private String patronymicName;
    private String email;
    private int age;
}
