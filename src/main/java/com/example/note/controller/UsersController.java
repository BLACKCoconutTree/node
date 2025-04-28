package com.example.note.controller;

import com.example.note.entities.Users;
import com.example.note.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id) {
        return userService.getById(id);  // 调用 MyBatis-Plus 内置方法
    }
}
