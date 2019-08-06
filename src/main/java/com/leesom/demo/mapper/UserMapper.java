package com.leesom.demo.mapper;

import com.leesom.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User SelectUser(int id);

    User login(String userName,String passWord);

    int register(User user);
}
