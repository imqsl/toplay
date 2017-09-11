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
                if (seckill.getSeckill_number() != null && !seckill.getSeckill_number().equals("")) {
                    VALUES("seckill_number", "#{seckill_number}");
                }
                if (seckill.getStart_time() != null && !seckill.getStart_time().equals("")) {
                    VALUES("start_time", "#{start_time}");
                }
                if (seckill.getEnd_time() != null && !seckill.getEnd_time().equals("")) {
                    VALUES("end_time", "#{end_time}");
                }
                if (seckill.getCreate_time() != null && !seckill.getCreate_time().equals("")) {
                    VALUES("create_time", "#{create_time}");
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
                if (seckill.getSeckill_number() != null && !seckill.getSeckill_number().equals("")) {
                    SET("seckill_number=#{seckill_number}");
                }
                if (seckill.getStart_time() != null && !seckill.getStart_time().equals("")) {
                    SET("start_time=#{start_time}");
                }
                if (seckill.getEnd_time() != null && !seckill.getEnd_time().equals("")) {
                    SET("end_time=#{end_time}");
                }
                if (seckill.getCreate_time() != null && !seckill.getCreate_time().equals("")) {
                    SET("create_time=#{create_time}");
                }
                WHERE("seckill_id=#{seckill_id}");
            }
        }.toString();
    }

    //动态查询
    public String selectWithParams(final Seckill seckill) {
        return new SQL() {
            {
                SELECT("*");
                FROM(SECKILLTABLE);
                if (seckill.getSeckill_id() != null && !seckill.getSeckill_id().equals("")) {
                    WHERE("seckill_id=#{seckill_id}");
                }
                if (seckill.getName() != null && !seckill.getName().equals("")) {
                    WHERE("name LIKE CONCAT ('%',#{name},'%')");
                }
            }
        }.toString();
    }
}
