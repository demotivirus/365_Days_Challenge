package com.demotivirus.Day_103;

import com.demotivirus.Day_103.error.AwesomeException;
import com.demotivirus.Day_103.error.MainException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getById(@PathVariable(name = "id") int id) {
        User user = userService.getById(id);
        if (user == null)
            throw new MainException();
        return user;
    }
}
