package com.imqsl.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class SuccessKilled implements Serializable {

    private Integer seckill_id;        //秒杀商品id
    private Integer user_id;           //用户id
    private Integer status;            //状态
    private Date create_time;      //创建时间

    public SuccessKilled() {
    }

    public SuccessKilled(Integer seckill_id, Integer user_id, Integer status, Date create_time) {
        this.seckill_id = seckill_id;
        this.user_id = user_id;
        this.status = status;
        this.create_time = create_time;
    }

    public Integer getSeckill_id() {
        return seckill_id;
    }

    public void setSeckill_id(Integer seckill_id) {
        this.seckill_id = seckill_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckill_id=" + seckill_id +
                ", user_id=" + user_id +
                ", status=" + status +
                ", create_time=" + create_time +
                '}';
    }
}
/*
* CREATE TABLE `successkilled`(
  `seckill_id` BIGINT(20) NOT NULL ,
  `user_id` BIGINT(20) NOT NULL ,
  `status` INT(4) NOT NULL DEFAULT -1,
  `create_time` DATETIME NOT NULL
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */