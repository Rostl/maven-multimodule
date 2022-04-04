package com.rost.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@AllArgsConstructor
@Builder(toBuilder = true)
@Value
public class UserDto {

     String fullName;
     int age;
     String email;
}