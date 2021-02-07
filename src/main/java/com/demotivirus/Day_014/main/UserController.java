package com.demotivirus.Day_014.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public String index() {
        return "index-user";
    }

    @GetMapping("list")
    public String listUsers(Model model) {
        //List<User> listUsers = userDao.getUsers();
        //model.addAttribute("users", listUsers);
        model.addAttribute("users", userService.getUsers());
        return "users-list";
    }

    @GetMapping("add-user")
    public String showFormAdd(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("save-user")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("update/{id}")
    public String updateUserGet(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "update-user";
    }

    @PostMapping("update-user")
    public String updateUserPost(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "redirect:/user/list";
    }
}
