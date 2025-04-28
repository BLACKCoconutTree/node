package com.example.note;

import com.example.note.entities.Users;
import com.example.note.mapper.UserMapper;
import com.example.note.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class NoteMapperTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
//        Users byId = userService.getById(1L);
//        System.out.println(byId.getId()+"----------"+byId.getName());
//        Users users = userMapper.selectById(1L);
//        System.out.println(users.getId()+"----------"+users.getName());

        Users users1 = new Users();
        users1.setId(null);
        users1.setName("adadas");

        userMapper.addUser(users1);
        System.out.println(users1.getId()+"=========");

    }
}