package com.imqsl.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Activity implements Serializable {
    private String id;        //活动id
    private String actTitle;      //活动标题
    private Integer sponsorId;    //活动发起者id
    private String actContent;    //活动内容
    private String type;           //活动类型
    private Integer stat;        //活动状态
    private Date createTime;      //创建时间

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;         //截止时间

    public Activity() {
    }

    public Activity(String actTitle, Integer sponsorId, String actContent, String type, Integer stat, Date createTime, Date endTime) {
        this.actTitle = actTitle;
        this.sponsorId = sponsorId;
        this.actContent = actContent;
        this.type = type;
        this.stat = stat;
        this.createTime = createTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id='" + id + '\'' +
                ", actTitle='" + actTitle + '\'' +
                ", sponsorId=" + sponsorId +
                ", actContent='" + actContent + '\'' +
                ", type='" + type + '\'' +
                ", stat=" + stat +
                ", createTime=" + createTime +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
