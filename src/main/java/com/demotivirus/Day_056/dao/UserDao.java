package com.demotivirus.Day_056.dao;

import com.demotivirus.Day_056.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
