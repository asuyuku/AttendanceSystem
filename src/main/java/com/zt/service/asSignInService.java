package com.zt.service;

import com.zt.mapper.asSignInMapper;
import com.zt.pojo.Record;
import com.zt.pojo.User;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 * Created by tjzha on 2019/5/10.
 */
@Service
public class asSignInService
{
    asSignInMapper signInMapper ;
    public boolean signIn(User user,double lng,double lat)
    {
        Record record=new Record();
        record.setSUser_id(user.getId());
        record.setLat(lat);
        record.setLng(lng);
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        record.setRecordTime(sdf);

        if(signInMapper.insertSignInData(record)>0)
            return true;
        return false;
    }
}
