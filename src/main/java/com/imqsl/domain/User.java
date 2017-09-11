package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class User implements Serializable {
    private Integer user_id;           //id
    private String gender;            //性别
    private String username;         //用户名
    private String password;         //密码
    private Integer stu_id;              //学号
    private Integer phone;               //电话
    private String address;          //地址
    private String college;          //学院
    private Integer credit;              //信用

    public User() {
        super();
    }

    public User(String gender, String username, String password, Integer stu_id, Integer phone, String address, String college, Integer credit) {
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.stu_id = stu_id;
        this.phone = phone;
        this.address = address;
        this.college = college;
        this.credit = credit;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", stu_id=" + stu_id +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", college='" + college + '\'' +
                ", credit=" + credit +
                '}';
    }
}
/*
* CREATE TABLE `user`(
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `gender` INT(4) NOT NULL DEFAULT 1 COMMENT '男',
  `username` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL ,
  `stu_id` BIGINT(20) NOT NULL,
  `phone` BIGINT(20) NOT NULL ,
  `address` VARCHAR(255) NOT NULL ,
  `college` VARCHAR(20) NOT NULL ,
  `credit` INT(10) NOT NULL DEFAULT 100,
  PRIMARY KEY (`user_id`)
)
* */
