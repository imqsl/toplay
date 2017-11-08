package com.imqsl.domain;

import java.io.Serializable;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Play implements Serializable {

    private Integer id;          //用户活动id
    private String actId;        //活动id
    private Integer sponsorId;    //发起者id
    private Integer partId;       //参与者id
    private Integer stat;        //状态
    private String description;//描述

    public Play() {
    }

    public Play(Integer id, String actId, Integer sponsorId, Integer partId, Integer stat, String description) {
        this.id = id;
        this.actId = actId;
        this.sponsorId = sponsorId;
        this.partId = partId;
        this.stat = stat;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
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
                "id=" + id +
                ", actId='" + actId + '\'' +
                ", sponsorId=" + sponsorId +
                ", partId=" + partId +
                ", stat=" + stat +
                ", description='" + description + '\'' +
                '}';
    }
}
/*
* CREATE TABLE `play`(
  `play_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `act_id` BIGINT(20) NOT NULL ,
  `sponsor_id` BIGINT(20) NOT NULL ,
  `part_id` BIGINT(20) NOT NULL ,
  `stat` BIGINT(4) NOT NULL ,
  `description` VARCHAR(255) NOT NULL ,
  PRIMARY KEY (`play_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */