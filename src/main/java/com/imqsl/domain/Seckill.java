package com.imqsl.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by imqsl on 2017/9/7.
 */
public class Seckill {
    private Integer id;          //秒杀商品id
    private String name;             //秒杀名称
    private Float price;             //秒杀价格
    private Integer seckillNumber;      //秒杀数量
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;         //秒杀开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;           //秒杀结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;        //秒杀创建时间

    public Seckill() {
    }

    public Seckill(Integer id, String name, Float price, Integer seckillNumber, Date startTime, Date endTime, Date createTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.seckillNumber = seckillNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSeckillNumber() {
        return seckillNumber;
    }

    public void setSeckillNumber(Integer seckillNumber) {
        this.seckillNumber = seckillNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", seckillNumber=" + seckillNumber +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
