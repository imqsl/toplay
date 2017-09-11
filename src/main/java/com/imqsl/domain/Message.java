package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Message implements Serializable {

    private Integer m_id;            //消息id
    private Integer user_id;         //用户id
    private String title;        //标题
    private String content;      //内容

    public Message() {

    }

    public Message(Integer m_id, Integer user_id, String title, String content) {
        this.user_id = user_id;
        this.title = title;
        this.content = content;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MessageDao{" +
                "m_id=" + m_id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
/*
* CREATE TABLE `message`(
   `m_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT(20) NOT NULL,
   `title` VARCHAR(45) NOT NULL,
   `content` VARCHAR(255) NOT NULL ,
   PRIMARY KEY (`m_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */
