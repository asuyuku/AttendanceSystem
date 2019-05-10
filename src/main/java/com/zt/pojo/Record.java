package com.zt.pojo;

import lombok.Data;

import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 * Created by tjzha on 2019/5/10.
 */
@Data
public class Record {
    Long id;
    Long sUser_id;
    SimpleDateFormat recordTime;
    Long sLesson_id;
    double lng;
    double lat;
    int state;
}
