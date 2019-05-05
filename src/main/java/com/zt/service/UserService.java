package com.zt.service;

import com.zt.mapper.UserMapper;
import com.zt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> select(User user){
        List<User> userList = userMapper.select(user);
        return userList;
    }

    public User login(User user){
        String number = user.getNumber();
        User user1 = new User();
        user1.setNumber(number);
        user1 = select(user1).get(0);
        if(user1.getPassword().equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
