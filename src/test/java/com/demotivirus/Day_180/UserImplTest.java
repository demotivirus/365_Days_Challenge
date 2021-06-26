package com.demotivirus.Day_180;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {
    private static User user;

    @BeforeAll
    public static void init() {
        user = new UserImpl();
    }

    @Test
    @DisplayName("Add user")
    public void addUserInfo() {
        user.addUserInfo("Go to work at 6 o'clock");
    }

    @Test
    @DisplayName("Test for null")
    public void addNull() {
        assertThrows(IllegalArgumentException.class, () -> user.addUserInfo(null));
    }

    @Test
    @DisplayName("Read user size")
    void readUserInfo() {
        user.addUserInfo("Read newspaper in 12:34");
        user.addUserInfo("Read newspaper in 12:35");
        user.addUserInfo("Read newspaper in 12:36");
        user.addUserInfo("Read newspaper in 12:37");
        user.addUserInfo("Read newspaper in 12:38");

        assertEquals(4, user.readUserInfo().size());
    }
}