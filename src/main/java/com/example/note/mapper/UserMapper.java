package com.example.note.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.note.entities.Users;


public interface UserMapper extends BaseMapper<Users> {

    /**
     * @param users
     */
    public void addUser(Users users);
}