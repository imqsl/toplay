package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Manager implements Serializable {
    private Integer id;          //id
    private String name;     //用户名
    private String password;      //密码

    public Manager() {
    }

    public Manager(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
* CREATE TABLE `manager`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL ,
  `password` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */
