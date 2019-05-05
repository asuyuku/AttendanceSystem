package com.zt.mapper;

import com.zt.pojo.User;

import java.util.List;

public interface UserMapper{
    List<User> select(User user);
}
