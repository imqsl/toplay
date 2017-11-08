package com.imqsl.dao.provider;

import com.imqsl.domain.SuccessKilled;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.SUCCESSKILLEDTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class SuccessKilledDynaSqlProvider {
    //动态插入
    public String insertWithParams(final SuccessKilled successKilled) {
        return new SQL() {
            {
                INSERT_INTO(SUCCESSKILLEDTABLE);
                if (successKilled.getSeckillId() != null && !successKilled.getSeckillId().equals("")) {
                    VALUES("seckill_id", "#{seckillId}");
                }
                if (successKilled.getUserId() != null && !successKilled.getUserId().equals("")) {
                    VALUES("user_id", "#{userId}");
                }
                if (successKilled.getStat() != null && !successKilled.getStat().equals("")) {
                    VALUES("stat", "#{stat}");
                }
                if (successKilled.getCreateTime() != null && !successKilled.getCreateTime().equals("")) {
                    VALUES("create_time", "#{createTime}");
                }
            }
        }.toString();
    }

    //动态查询
    public String selectWithParams(final SuccessKilled successKilled) {
        return new SQL() {
            {
                SELECT("*");
                FROM(SUCCESSKILLEDTABLE);
                if (successKilled.getSeckillId() != null && !successKilled.getSeckillId().equals("")) {
                    WHERE("seckill_id=#{seckillId}");
                }
                if (successKilled.getUserId() != null && !successKilled.getUserId().equals("")) {
                    WHERE("user_id=#{userId}");
                }
                if (successKilled.getStat() != null && !successKilled.getStat().equals("")) {
                    WHERE("stat=#{stat}");
                }

            }
        }.toString();
    }
    //动态修改
    public String updateWithParams(final SuccessKilled successKilled) {
        return new SQL() {
            {
                UPDATE(SUCCESSKILLEDTABLE);
                if (successKilled.getSeckillId() != null && !successKilled.getSeckillId().equals("")) {
                    SET("seckill_id=#{seckillId}");
                }
                if (successKilled.getUserId() != null && !successKilled.getUserId().equals("")) {
                    SET("user_id=#{userId}");
                }
                if (successKilled.getStat() != null && !successKilled.getStat().equals("")) {
                    SET("stat=#{stat}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }
}
