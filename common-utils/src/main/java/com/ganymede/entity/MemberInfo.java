package com.ganymede.entity;

import lombok.Data;

import java.util.Date;

/**
 * 会员实体类
 */
@Data
public class MemberInfo {
    private int id;
    private String account;
    private String password;
    private String repassword;
    private int sex;
    private int age;
    private String phone;
    private int status;
    private Date createTime;
    private Date updateTime;
}
