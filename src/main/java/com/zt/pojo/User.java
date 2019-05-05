package com.zt.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer type;
    private Long classId;
    private String number;
    private String email;
}
