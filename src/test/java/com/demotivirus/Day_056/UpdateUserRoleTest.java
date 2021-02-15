package com.demotivirus.Day_056;

import com.demotivirus.Day_056.dao.UserDao;
import com.demotivirus.Day_056.model.Role;
import com.demotivirus.Day_056.model.User;
import com.demotivirus.Day_056.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class UpdateUserRoleTest {
    @MockBean
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void test(){
        Role role = new Role(1L, "ADMIN");
        User user = new User();
        user.addRole(role);
        role.addUser(user);

        Mockito.when(userDao.getOne(1L)).thenReturn(user);
        user = userService.getOneById(1l);
        System.err.println("The user is: " + user);
        System.err.println("The user getRole is: " + user.getRole(role));
        System.err.println("The role [" + role.getName() + "] has users: " + role.getUsers());
        Assertions.assertEquals(role, user.getRole(role));
    }

    @Test
    public void updateUserRoleTest(){
        User user = new User();
        Role roleAdmin = new Role(1L, "ADMIN");

        user.addRole(roleAdmin);
        Role roleUser = new Role(2L, "User");
        user.updateUserRole(roleUser);
        Assertions.assertEquals(roleUser, user.getRole(roleUser));
    }
}
