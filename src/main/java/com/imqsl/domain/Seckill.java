package com.imqsl.domain;

import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Seckill {
    private Integer seckill_id;          //秒杀商品id
    private String name;             //秒杀名称
    private Integer seckill_number;      //秒杀数量
    private Date start_time;         //秒杀开始时间
    private Date end_time;           //秒杀结束时间
    private Date create_time;        //秒杀创建时间

    public Seckill() {
    }

    public Seckill(String name, Integer seckill_number, Date start_time, Date end_time, Date create_time) {
        this.name = name;
        this.seckill_number = seckill_number;
        this.start_time = start_time;
        this.end_time = end_time;
        this.create_time = create_time;
    }

    public Integer getSeckill_id() {
        return seckill_id;
    }

    public void setSeckill_id(Integer seckill_id) {
        this.seckill_id = seckill_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeckill_number() {
        return seckill_number;
    }

    public void setSeckill_number(Integer seckill_number) {
        this.seckill_number = seckill_number;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckill_id=" + seckill_id +
                ", name='" + name + '\'' +
                ", seckill_number=" + seckill_number +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", create_time=" + create_time +
                '}';
    }
}
/*
* CREATE TABLE `seckill`(
  `seckill_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL ,
  `seckill_number` INT(10) NOT NULL ,
  `start_time` DATETIME NOT NULL ,
  `end_time` DATETIME NOT NULL ,
  `create_time` DATETIME NOT NULL ,
  PRIMARY KEY (`seckill_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
* */