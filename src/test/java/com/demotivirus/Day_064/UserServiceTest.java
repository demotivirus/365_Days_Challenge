package com.demotivirus.Day_064;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
    @Mock
    private UserDao userDao;

    private UserService userService;

    public UserServiceTest(){
        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(userDao);
    }

    @Test
    public void checkUserExistsTest(){
        BDDMockito.given(userDao.getUserByUsername("mockitoUser@gmail.com"))
                .willReturn(new User("mockitoUser@gmail.com"));

        boolean userIsPresent = userService.checkUserIsPresent(new User("mockitoUser@gmail.com"));
        Assertions.assertThat(userIsPresent).isTrue();
    }

    @Test
    public void checkUserReturnFalse(){
        BDDMockito.given(userDao.getUserByUsername("mockitoUser@gmail.com"))
                .willReturn(null);

        boolean isReturnFalse = userService.checkUserIsPresent(new User("mockitoUser@gmail.com"));
        Assertions.assertThat(isReturnFalse).isFalse();
    }
}
