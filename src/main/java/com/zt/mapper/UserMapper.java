package com.zt.mapper;

import com.zt.pojo.Record;
import com.zt.pojo.User;

import java.util.List;

public interface UserMapper{
    List<User> select(User user);
    List<Record> selectRecord(User user);
    List<Record> teacherSelectRecord(User user);
}
