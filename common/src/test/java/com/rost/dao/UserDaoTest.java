package com.rost.dao;

import com.rost.entity.UserEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void before(){
        userDao = new UserDao();
    }

    @Test
    public void userDaoTest(){
        Optional<UserEntity> user = userDao.getUserById(1L);
        Assert.assertTrue(user.isPresent());
        Assert.assertEquals(1L, user.get().getId());
    }
}