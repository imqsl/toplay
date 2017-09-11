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
                if (activity.getAct_content() != null && !activity.getAct_content().equals("")) {
                    WHERE("act_content LIKE CONCAT ('%',#{act_content},'%')");
                }
                if (activity.getAct_title() != null && !activity.getAct_title().equals("")) {
                    WHERE("act_title LIKE CONCAT ('%',#{act_title},'%')");
                }
                if (activity.getCreate_time() != null && !activity.getCreate_time().equals("")) {
                    WHERE("create_time LIKE CONCAT ('%',#{create_time},'%')");
                }
                if (activity.getEnd_time() != null && !activity.getEnd_time().equals("")) {
                    WHERE("end_time LIKE CONCAT ('%',#{end_time},'%')");
                }
                if (activity.getStatus() != null && !activity.getStatus().equals("")) {
                    WHERE("status LIKE CONCAT ('%',#{status},'%')");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    WHERE("type LIKE CONCAT ('%',#{type},'%')");
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
                if (activity.getAct_content() != null && !activity.getAct_content().equals("")) {
                    WHERE("act_content LIKE CONCAT ('%',#{act_content},'%')");
                }
                if (activity.getAct_title() != null && !activity.getAct_title().equals("")) {
                    WHERE("act_title LIKE CONCAT ('%',#{act_title},'%')");
                }
                if (activity.getCreate_time() != null && !activity.getCreate_time().equals("")) {
                    WHERE("create_time LIKE CONCAT ('%',#{create_time},'%')");
                }
                if (activity.getEnd_time() != null && !activity.getEnd_time().equals("")) {
                    WHERE("end_time LIKE CONCAT ('%',#{end_time},'%')");
                }
                if (activity.getStatus() != null && !activity.getStatus().equals("")) {
                    WHERE("status LIKE CONCAT ('%',#{status},'%')");
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
                if (activity.getAct_content() != null && !activity.getAct_content().equals("")) {
                    VALUES("act_content", "#{act_content}");
                }
                if (activity.getAct_title() != null && !activity.getAct_title().equals("")) {
                    VALUES("act_title", "#{act_title}");
                }
                if (activity.getCreate_time() != null && !activity.getCreate_time().equals("")) {
                    VALUES("create_time", "#{create_time}");
                }
                if (activity.getEnd_time() != null && !activity.getEnd_time().equals("")) {
                    VALUES("end_time", "#{end_time}");
                }
                if (activity.getStatus() != null && !activity.getStatus().equals("")) {
                    VALUES("status", "#{status}");
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
                if (activity.getAct_content() != null && !activity.getAct_content().equals("")) {
                    SET("act_content=#{act_content}");
                }
                if (activity.getAct_title() != null && !activity.getAct_title().equals("")) {
                    SET("act_title=#{act_title}");
                }
                if (activity.getCreate_time() != null && !activity.getCreate_time().equals("")) {
                    SET("create_time=#{create_time}");
                }
                if (activity.getEnd_time() != null && !activity.getEnd_time().equals("")) {
                    SET("end_time=#{end_time}");
                }
                if (activity.getStatus() != null && !activity.getStatus().equals("")) {
                    SET("status=#{status}");
                }
                if (activity.getType() != null && !activity.getType().equals("")) {
                    SET("type=#{type}");
                }
                WHERE("act_id=#{act_id}");

            }
        }.toString();
    }
}
