package com.imqsl.dao.provider;

import com.imqsl.domain.Seckill;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.SECKILLTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class SeckillDynaSqlProvider {
    //动态插入
    public String insertWithParams(final Seckill seckill) {
        return new SQL() {
            {
                INSERT_INTO(SECKILLTABLE);
                if (seckill.getName() != null && !seckill.getName().equals("")) {
                    VALUES("name", "#{name}");
                }
                if (seckill.getSeckillNumber() != null && !seckill.getSeckillNumber().equals("")) {
                    VALUES("price", "#{price}");
                }
                if (seckill.getSeckillNumber() != null && !seckill.getSeckillNumber().equals("")) {
                    VALUES("seckill_number", "#{seckillNumber}");
                }
                if (seckill.getStartTime() != null && !seckill.getStartTime().equals("")) {
                    VALUES("start_time", "#{startTime}");
                }
                if (seckill.getEndTime() != null && !seckill.getEndTime().equals("")) {
                    VALUES("end_time", "#{endTime}");
                }
                if (seckill.getCreateTime() != null && !seckill.getCreateTime().equals("")) {
                    VALUES("create_time", "#{createTime}");
                }
            }
        }.toString();
    }

    //动态修改
    public String updateWithParams(final Seckill seckill) {
        return new SQL() {
            {
                UPDATE(SECKILLTABLE);
                if (seckill.getName() != null && !seckill.getName().equals("")) {
                    SET("name=#{name}");
                }
                if (seckill.getSeckillNumber() != null && !seckill.getSeckillNumber().equals("")) {
                    SET("price=#{price}");
                }
                if (seckill.getSeckillNumber() != null && !seckill.getSeckillNumber().equals("")) {
                    SET("seckill_number=#{seckillNumber}");
                }
                if (seckill.getStartTime() != null && !seckill.getStartTime().equals("")) {
                    SET("start_time=#{startTime}");
                }
                if (seckill.getEndTime() != null && !seckill.getEndTime().equals("")) {
                    SET("end_time=#{endTime}");
                }
                if (seckill.getCreateTime() != null && !seckill.getCreateTime().equals("")) {
                    SET("create_time=#{createTime}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

    //动态查询
    public String selectWithParams(final Seckill seckill) {
        return new SQL() {
            {
                SELECT("*");
                FROM(SECKILLTABLE);
                if (seckill.getId() != null && !seckill.getId().equals("")) {
                    WHERE("id=#{id}");
                }
                if (seckill.getName() != null && !seckill.getName().equals("")) {
                    WHERE("name LIKE CONCAT ('%',#{name},'%')");
                }
            }
        }.toString();
    }
}
