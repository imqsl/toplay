package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Note implements Serializable {
private Integer id;              //id
private String title;        //标题
private String content;      //内容
private String type;            //类型

    public Note() {
    }

    public Note(String title, String content, String type) {
        this.title = title;
        this.content = content;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
/*
* CREATE TABLE `note`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL ,
  `content` LONGTEXT NOT NULL ,
  `type` INT(4) NOT NULL ,
  PRIMARY KEY (`id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */