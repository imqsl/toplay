package com.imqsl.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class SuccessKilled implements Serializable {

    private Integer id;        //秒杀商品id
    private Integer seckillId;
    private Integer userId;           //用户id
    private Integer stat;            //状态
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;      //创建时间

    public SuccessKilled() {
    }

    public SuccessKilled(Integer id, Integer seckillId, Integer userId, Integer stat, Date createTime) {
        this.id = id;
        this.seckillId = seckillId;
        this.userId = userId;
        this.stat = stat;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Integer seckillId) {
        this.seckillId = seckillId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "id=" + id +
                ", seckillId=" + seckillId +
                ", userId=" + userId +
                ", stat=" + stat +
                ", createTime=" + createTime +
                '}';
    }
}