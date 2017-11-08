package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Message implements Serializable {

    private Integer id;            //消息id
    private Integer userId;         //用户id
    private String title;        //标题
    private String content;      //内容

    public Message() {

    }

    public Message(Integer id, Integer userId, String title, String content) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "Message{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
/*
* CREATE TABLE `message`(
   `message_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT(20) NOT NULL,
   `title` VARCHAR(45) NOT NULL,
   `content` VARCHAR(255) NOT NULL ,
   PRIMARY KEY (`message_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */
