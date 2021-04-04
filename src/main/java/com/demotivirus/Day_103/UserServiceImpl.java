package com.demotivirus.Day_103;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static Map<Integer, User> users = new HashMap<>() {{
        put(1, new User(0, null, null));
        put(2, new User(1, "Mikle", "Jackson"));
        put(3, new User(2, "Thomas", "Hardy"));
        put(4, new User(3, "Charly", "Chaplin"));
    }};

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
