package com.demotivirus.Day_064;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {
    private UserDao userDao;

    @BeforeEach
    public void init(){
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void userReturnTrueTest(){
        User remy = userDao.getUserByUsername("remy@gmail.com");
        Assertions.assertThat(remy).isNotNull();
        Assertions.assertThat(remy.getUsername()).isEqualTo("remy@gmail.com");
    }

    @Test
    public void userReturnNullTest(){
        User notFind = userDao.getUserByUsername("sdfsdf@gmail.com");
        Assertions.assertThat(notFind).isNull();
    }

    @Test
    public void findAllTest(){
        List<User> users = userDao.findAllUsers();
        Assertions.assertThat(users.get(2)).isEqualTo(new User("remy@gmail.com", "ADMIN"));
        Assertions.assertThat(users).contains(new User("remy@gmail.com", "ADMIN"));
    }
}
