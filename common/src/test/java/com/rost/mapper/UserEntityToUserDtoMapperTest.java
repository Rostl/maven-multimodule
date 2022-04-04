package com.rost.mapper;

import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;
import com.rost.util.CommonTestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserEntityToUserDtoMapperTest {

    private UserEntityToUserDtoMapper userEntityToUserDtoMapper;

    @Before
    public void before() {
        userEntityToUserDtoMapper = new UserEntityToUserDtoMapper();
    }

    @Test
    public void userEntityToUserDtoMappingTest() {
        UserDto expected = CommonTestUtil.userDtoBuilder();
        UserEntity userEntity = CommonTestUtil.userEntityBuilder()
                .orElseThrow(() -> new RuntimeException("User is not present"));
        UserDto actual = userEntityToUserDtoMapper.map(userEntity);
        Assert.assertEquals(expected, actual);
    }
}