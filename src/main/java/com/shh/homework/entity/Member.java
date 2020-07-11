package com.shh.homework.entity;

import lombok.Data;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
public class Member implements Serializable {
    private BigInteger memberId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String email;
    private Integer status;
    private Date createTime;
    private Date updateTime;
    private String icon;




}
