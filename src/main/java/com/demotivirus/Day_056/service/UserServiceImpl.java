package com.demotivirus.Day_056.service;

import com.demotivirus.Day_056.dao.UserDao;
import com.demotivirus.Day_056.model.Role;
import com.demotivirus.Day_056.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void updateUserRole(Long userId, Role role) {
        User user = userDao.getOne(userId);
        List<Role> roles = user.getRoles();
        if (roles.isEmpty())
            roles.add(new Role(1L, "POTENTIAL AGENT"));
        else roles.add(role);
        userDao.save(user);
    }

    @Override
    public User getOneById(Long id) {
        return userDao.getOne(id);
    }
}
