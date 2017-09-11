package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Play implements Serializable {

    private Integer p_id;          //用户活动id
    private Integer act_id;        //活动id
    private Integer sponsor_id;    //发起者id
    private Integer part_id;       //参与者id
    private Integer status;        //状态
    private String description;//描述

    public Play() {
    }

    public Play(Integer act_id, Integer sponsor_id, Integer part_id, Integer status, String description) {
        this.act_id = act_id;
        this.sponsor_id = sponsor_id;
        this.part_id = part_id;
        this.status = status;
        this.description = description;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getAct_id() {
        return act_id;
    }

    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    public Integer getSponsor_id() {
        return sponsor_id;
    }

    public void setSponsor_id(Integer sponsor_id) {
        this.sponsor_id = sponsor_id;
    }

    public Integer getPart_id() {
        return part_id;
    }

    public void setPart_id(Integer part_id) {
        this.part_id = part_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Play{" +
                "p_id=" + p_id +
                ", act_id=" + act_id +
                ", sponsor_id=" + sponsor_id +
                ", part_id=" + part_id +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
/*
* CREATE TABLE `play`(
  `p_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `act_id` BIGINT(20) NOT NULL ,
  `sponsor_id` BIGINT(20) NOT NULL ,
  `part_id` BIGINT(20) NOT NULL ,
  `status` BIGINT(4) NOT NULL ,
  `description` VARCHAR(255) NOT NULL ,
  PRIMARY KEY (`p_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */