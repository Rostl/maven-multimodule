package com.rost.service;

import com.rost.dao.UserDao;
import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;
import com.rost.mapper.UserEntityToUserDtoMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;
    private final UserEntityToUserDtoMapper userMapper;

    public UserDto getUser(long id) {
        UserEntity userEntity = userDao.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User is not present in database"));
        return userMapper.map(userEntity);
    }
}