package com.imqsl.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Activity implements Serializable {
    private Integer act_id;        //活动id
    private String act_title;      //活动标题
    private String act_content;    //活动内容
    private String type;           //活动类型
    private Integer status;        //活动状态
    private Date create_time;      //创建时间
    private Date end_time;         //截止时间
    public Activity() {
    }

    public Activity( String act_title, String act_content, String type, Integer status, Date create_time, Date end_time) {
        this.act_title = act_title;
        this.act_content = act_content;
        this.type = type;
        this.status = status;
        this.create_time = create_time;
        this.end_time = end_time;
    }

    public Integer getAct_id() {
        return act_id;
    }

    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    public String getAct_title() {
        return act_title;
    }

    public void setAct_title(String act_title) {
        this.act_title = act_title;
    }

    public String getAct_content() {
        return act_content;
    }

    public void setAct_content(String act_content) {
        this.act_content = act_content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "act_id=" + act_id +
                ", act_title='" + act_title + '\'' +
                ", act_content='" + act_content + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", end_time=" + end_time +
                '}';
    }
}
/*
* CREATE TABLE `activity`(
  `act_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `act_title` VARCHAR(45) NOT NULL ,
  `act_content` VARCHAR(255) NOT NULL ,
  `type` INT(4) NOT NULL ,
  `status` INT(4) NOT NULL,
  PRIMARY KEY (`act_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
*
* */
