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
                if (successKilled.getSeckill_id() != null && !successKilled.getSeckill_id().equals("")) {
                    VALUES("seckill_id", "#{seckill_id}");
                }
                if (successKilled.getUser_id() != null && !successKilled.getUser_id().equals("")) {
                    VALUES("user_id", "#{user_id}");
                }
                if (successKilled.getStatus() != null && !successKilled.getStatus().equals("")) {
                    VALUES("status", "#{status}");
                }
                if (successKilled.getCreate_time() != null && !successKilled.getCreate_time().equals("")) {
                    VALUES("create_time", "#{create_time}");
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
                if (successKilled.getSeckill_id() != null && !successKilled.getSeckill_id().equals("")) {
                    WHERE("seckill_id=#{seckill_id}");
                }
                if (successKilled.getUser_id() != null && !successKilled.getUser_id().equals("")) {
                    WHERE("user_id=#{user_id}");
                }
                if (successKilled.getStatus() != null && !successKilled.getStatus().equals("")) {
                    WHERE("status=#{status}");
                }

            }
        }.toString();
    }
}
