CREATE DATABASE `toplay` ;

USE toplay;

CREATE TABLE `note`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL ,
  `content` LONGTEXT NOT NULL ,
  `type` INT(4) NOT NULL ,
  PRIMARY KEY (`id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `user`(
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `gender` INT(4) NOT NULL DEFAULT 1 COMMENT '性别',
  `username` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL ,
  `stu_id` BIGINT(20) NOT NULL COMMENT '学号',
  `phone` BIGINT(20) NOT NULL ,
  `address` VARCHAR(255) NOT NULL ,
  `college` VARCHAR(20) NOT NULL ,
  `credit` INT(10) NOT NULL DEFAULT 100 COMMENT '信用分',
  PRIMARY KEY (`user_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `manager`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL ,
  `password` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `activity`(
  `act_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `act_title` VARCHAR(45) NOT NULL ,
  `act_content` VARCHAR(255) NOT NULL ,
  `type` INT(4) NOT NULL ,
  `status` INT(4) NOT NULL,
  PRIMARY KEY (`act_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `play`(
  `p_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `act_id` BIGINT(20) NOT NULL ,
  `sponsor_id` BIGINT(20) NOT NULL ,
  `part_id` BIGINT(20) NOT NULL ,
  `status` BIGINT(4) NOT NULL ,
  `description` VARCHAR(255) NOT NULL ,
  PRIMARY KEY (`p_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `seckill`(
  `seckill_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL ,
  `seckill_number` INT(10) NOT NULL ,
  `start_time` DATETIME NOT NULL ,
  `end_time` DATETIME NOT NULL ,
  `create_time` DATETIME NOT NULL ,
  PRIMARY KEY (`seckill_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `successkilled`(
  `seckill_id` BIGINT(20) NOT NULL ,
  `user_id` BIGINT(20) NOT NULL ,
  `status` INT(4) NOT NULL DEFAULT -1,
  `create_time` DATETIME NOT NULL
)ENGINE =InnoDB DEFAULT CHARSET =utf8;

CREATE TABLE `message`(
   `m_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT(20) NOT NULL,
   `title` VARCHAR(45) NOT NULL,
   `content` VARCHAR(255) NOT NULL ,
   PRIMARY KEY (`m_id`)
)ENGINE =InnoDB DEFAULT CHARSET =utf8;
