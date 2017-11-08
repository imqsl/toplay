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
                if (play.getActId() != null && !play.getActId().equals("")) {
                    VALUES("act_id", "#{actId}");
                }
                if (play.getSponsorId() != null && !play.getSponsorId().equals("")) {
                    VALUES("sponsor_id", "#{sponsorId}");
                }
                if (play.getPartId() != null && !play.getPartId().equals("")) {
                    VALUES("part_id", "#{partId}");
                }
                if (play.getStat() != null && !play.getStat().equals("")) {
                    VALUES("stat", "#{stat}");
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
                if (play.getId() != null && !play.getId().equals("")) {
                    WHERE("id=#{id}");
                }
                if (play.getActId() != null && !play.getActId().equals("")) {
                    WHERE("act_id=#{actId}");
                }
                if (play.getSponsorId() != null && !play.getSponsorId().equals("")) {
                    WHERE("sponsor_id=#{sponsorId}");
                }
                if (play.getPartId() != null && !play.getPartId().equals("")) {
                    WHERE("part_id=#{partId}");
                }
                if (play.getStat() != null && !play.getStat().equals("")) {
                    WHERE("stat LIKE CONCAT ('%',#{stat},'%')");
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
                if (play.getActId() != null && !play.getActId().equals("")) {
                    SET("act_id=#{actId}");
                }
                if (play.getSponsorId() != null && !play.getSponsorId().equals("")) {
                    SET("sponsor_id=#{sponsorId}");
                }
                if (play.getPartId() != null && !play.getPartId().equals("")) {
                    SET("part_id=#{partId}");
                }
                if (play.getStat() != null && !play.getStat().equals("")) {
                    SET("stat=#{stat}");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    SET("description =#{description}");
                }
                WHERE("id=#{id}");

            }

        }.toString();
    }

    //动态查询
    public String selectWithParams(final Play play) {
        return new SQL() {
            {
                SELECT("*");
                FROM(PLAYTABLE);
                if (play.getId() != null && !play.getId().equals("")) {
                    WHERE("id=#{id}");
                }
                if (play.getActId() != null && !play.getActId().equals("")) {
                    WHERE("act_id=#{actId}");
                }
                if (play.getSponsorId() != null && !play.getSponsorId().equals("")) {
                    WHERE("sponsor_id=#{sponsorId}");
                }
                if (play.getPartId() != null && !play.getPartId().equals("")) {
                    WHERE("part_id=#{partId}");
                }
                if (play.getStat() != null && !play.getStat().equals("")) {
                    WHERE("stat LIKE CONCAT ('%',#{stat},'%')");
                }
                if (play.getDescription() != null && !play.getDescription().equals("")) {
                    WHERE("description LIKE CONCAT ('%',#{description},'%')");
                }
            }
        }.toString();
    }
}
