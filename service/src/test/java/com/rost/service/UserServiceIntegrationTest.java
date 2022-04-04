package com.rost.service;


import com.rost.dao.UserDao;
import com.rost.dto.UserDto;
import com.rost.mapper.UserEntityToUserDtoMapper;
import com.rost.util.ServiceTestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UserServiceIntegrationTest {

    private UserService userService;

    @Before
    public void before() {
        UserDao userDao = new UserDao();
        UserEntityToUserDtoMapper userEntityToUserDtoMapper = new UserEntityToUserDtoMapper();
        userService = new UserService(userDao, userEntityToUserDtoMapper);
    }

    @Test
    public void testGetUserById() {
        UserDto expectedUser = ServiceTestUtil.userDtoBuilder();
        UserDto actualUser = userService.getUser(1L);
        Assert.assertEquals(expectedUser, actualUser);
    }
}