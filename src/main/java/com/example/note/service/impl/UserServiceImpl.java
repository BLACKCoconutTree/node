package com.example.note.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.note.entities.Users;
import com.example.note.mapper.UserMapper;
import com.example.note.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Users> implements UserService {
}
