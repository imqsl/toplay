package com.imqsl.dao.provider;

import com.imqsl.domain.Activity;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.ACTIVITYTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class ActivityDynaSqlProvider {
    //动态查询
    public String selectWithParams(final Activity activity) {
        return new SQL() {
            {
                SELECT("*");
                FROM(ACTIVITYTABLE);

                if (activity.getActTitle() != null && !activity.getActTitle().equals("")) {
                    WHERE("act_title LIKE CONCAT ('%',#{actTitle},'%')");
                }

                if (activity.getStat() != null && !activity.getStat().equals("")) {
                    WHERE("stat LIKE CONCAT ('%',#{stat},'%')");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    WHERE("type LIKE CONCAT ('%',#{type},'%')");
                }
                if (activity.getSponsorId()!= null && !activity.getSponsorId().equals("")) {
                    WHERE("sponsor_id LIKE CONCAT ('%',#{sponsorId},'%')");
                }

            }
        }.toString();
    }

    //动态查询总数量
    public String count(final Activity activity) {
        return new SQL() {
            {
                SELECT("count(*)");
                FROM(ACTIVITYTABLE);
                if (activity.getActContent() != null && !activity.getActContent().equals("")) {
                    WHERE("act_content LIKE CONCAT ('%',#{actContent},'%')");
                }
                if (activity.getActTitle() != null && !activity.getActTitle().equals("")) {
                    WHERE("actcTitle LIKE CONCAT ('%',#{actTitle},'%')");
                }
                if (activity.getCreateTime() != null && !activity.getCreateTime().equals("")) {
                    WHERE("create_Time LIKE CONCAT ('%',#{createTime},'%')");
                }
                if (activity.getEndTime() != null && !activity.getEndTime().equals("")) {
                    WHERE("end_Time LIKE CONCAT ('%',#{endTime},'%')");
                }
                if (activity.getStat() != null && !activity.getStat().equals("")) {
                    WHERE("stat LIKE CONCAT ('%',#{stat},'%')");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    WHERE("type LIKE CONCAT ('%',#{type},'%')");
                }
            }
        }.toString();
    }

    //动态插入
    public String insertWithParams(final Activity activity) {
        return new SQL() {
            {
                INSERT_INTO(ACTIVITYTABLE);
                if (activity.getActContent() != null && !activity.getActContent().equals("")) {
                    VALUES("act_content", "#{actContent}");
                }
                if (activity.getId() != null && !activity.getId().equals("")) {
                    VALUES("id", "#{id}");
                }
                if (activity.getSponsorId() != null && !activity.getSponsorId().equals("")) {
                    VALUES("sponsor_id", "#{sponsorId}");
                }
                if (activity.getActTitle() != null && !activity.getActTitle().equals("")) {
                    VALUES("act_title", "#{actTitle}");
                }
                if (activity.getCreateTime() != null && !activity.getCreateTime().equals("")) {
                    VALUES("create_time", "#{createTime}");
                }
                if (activity.getEndTime() != null && !activity.getEndTime().equals("")) {
                    VALUES("end_time", "#{endTime}");
                }
                if (activity.getStat() != null && !activity.getStat().equals("")) {
                    VALUES("stat", "#{stat}");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    VALUES("type", "#{type}");
                }
            }
        }.toString();
    }

    //动态更新
    public String updateWithParams(final Activity activity) {
        return new SQL() {
            {
                UPDATE(ACTIVITYTABLE);
                if (activity.getActContent() != null && !activity.getActContent().equals("")) {
                    SET("act_content=#{actContent}");
                }
                if (activity.getActTitle() != null && !activity.getActTitle().equals("")) {
                    SET("act_title=#{actTitle}");
                }
                if (activity.getCreateTime() != null && !activity.getCreateTime().equals("")) {
                    SET("create_time=#{createTime}");
                }
                if (activity.getEndTime() != null && !activity.getEndTime().equals("")) {
                    SET("end_time=#{endTime}");
                }
                if (activity.getStat() != null && !activity.getStat().equals("")) {
                    SET("stat=#{stat}");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    SET("type=#{type}");
                }
                WHERE("id=#{id}");

            }
        }.toString();
    }
}
