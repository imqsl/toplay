package com.imqsl.dao.provider;

import com.imqsl.domain.Play;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.PLAYTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class PlayDynaSqlProvider {
    //动态
    public String insertWithParams(final Play play) {
        return new SQL(
        ) {
            {
                INSERT_INTO(PLAYTABLE);
                if (play.getAct_id() != null && !play.getAct_id().equals("")) {
                    VALUES("act_id", "#{act_id}");
                }
                if (play.getSponsor_id() != null && !play.getSponsor_id().equals("")) {
                    VALUES("sponsor_id", "#{sponsor_id}");
                }
                if (play.getPart_id() != null && !play.getPart_id().equals("")) {
                    VALUES("part_id", "#{part_id}");
                }
                if (play.getStatus() != null && !play.getStatus().equals("")) {
                    VALUES("status", "#{status}");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    VALUES("description", "#{description}");
                }
            }
        }.toString();
    }

    //动态删除
    public String deleteWithParams(final Play play) {
        return new SQL() {
            {
                DELETE_FROM(PLAYTABLE);
                if (play.getP_id() != null && !play.getP_id().equals("")) {
                    WHERE("p_id=#{p_id}");
                }
                if (play.getAct_id() != null && !play.getAct_id().equals("")) {
                    WHERE("act_id=#{act_id}");
                }
                if (play.getSponsor_id() != null && !play.getSponsor_id().equals("")) {
                    WHERE("sponsor_id=#{sponsor_id}");
                }
                if (play.getPart_id() != null && !play.getPart_id().equals("")) {
                    WHERE("part_id=#{part_id}");
                }
                if (play.getStatus() != null && !play.getStatus().equals("")) {
                    WHERE("status LIKE CONCAT ('%',#{p_id},'%')");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    WHERE("description LIKE CONCAT ('%',#{description},'%')");
                }
            }
        }.toString();
    }

    //动态修改
    public String updateWithParams(final Play play) {
        return new SQL() {
            {
                UPDATE(PLAYTABLE);
                if (play.getAct_id() != null && !play.getAct_id().equals("")) {
                    SET("act_id=#{act_id}");
                }
                if (play.getSponsor_id() != null && !play.getSponsor_id().equals("")) {
                    SET("sponsor_id=#{sponsor_id}");
                }
                if (play.getPart_id() != null && !play.getPart_id().equals("")) {
                    SET("part_id=#{part_id}");
                }
                if (play.getStatus() != null && !play.getStatus().equals("")) {
                    SET("status LIKE CONCAT ('%',#{p_id},'%')");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    SET("description LIKE CONCAT ('%',#{description},'%')");
                }
                WHERE("p_id=#{p_id}");

            }

        }.toString();
    }

    //动态查询
    public String selectWithParams(final Play play) {
        return new SQL() {
            {
                SELECT("*");
                FROM(PLAYTABLE);
                if (play.getP_id() != null && !play.getP_id().equals("")) {
                    WHERE("p_id=#{p_id}");
                }
                if (play.getAct_id() != null && !play.getAct_id().equals("")) {
                    WHERE("act_id=#{act_id}");
                }
                if (play.getSponsor_id() != null && !play.getSponsor_id().equals("")) {
                    WHERE("sponsor_id=#{sponsor_id}");
                }
                if (play.getPart_id() != null && !play.getPart_id().equals("")) {
                    WHERE("part_id=#{part_id}");
                }
                if (play.getStatus() != null && !play.getStatus().equals("")) {
                    WHERE("status LIKE CONCAT ('%',#{p_id},'%')");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    WHERE("description LIKE CONCAT ('%',#{description},'%')");
                }
            }
        }.toString();
    }
}
