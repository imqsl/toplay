package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class User implements Serializable {
    private Integer id;           //id
    private String gender;            //性别
    private String username;         //用户名
    private String password;         //密码
    private Long stuId;              //学号
    private Long phone;               //电话
    private String address;          //地址
    private String college;          //学院
    private Integer credit;              //信用

    public User() {
        super();
    }

    public User(Integer id, String gender, String username, String password, Long stuId, Long phone, String address, String college, Integer credit) {
        this.id = id;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.stuId = stuId;
        this.phone = phone;
        this.address = address;
        this.college = college;
        this.credit = credit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
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

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", stuId=" + stuId +
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
