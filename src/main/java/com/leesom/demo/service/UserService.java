package com.leesom.demo.service;

import com.leesom.demo.entity.User;
import com.leesom.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){

        return userMapper.SelectUser(id);
    }

    public User login(String userName,String passWord){

        return userMapper.login(userName,passWord);
    }

    public int register(User user){
        return userMapper.register(user);
    }
}
