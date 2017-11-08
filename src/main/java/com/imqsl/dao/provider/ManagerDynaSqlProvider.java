package com.imqsl.dao.provider;

import com.imqsl.domain.Manager;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.MANAGERTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class ManagerDynaSqlProvider {
    //动态查询管理员信息
    public String selectWithParams(final Manager manager) {
        return new SQL() {
            {
                SELECT("*");
                FROM(MANAGERTABLE);
                if (manager.getId() != null && !manager.getId().equals("")) {
                    WHERE(" id LIKE CONCAT ('%',#{id},'%')");
                }
                if (manager.getName() != null && !manager.getName().equals("")) {
                    WHERE(" name LIKE CONCAT ('%',#{name},'%')");
                }
                if (manager.getStat() != null && !manager.getStat().equals("")) {
                    WHERE(" stat LIKE CONCAT ('%',#{stat},'%')");
                }

            }
        }.toString();
    }

    //动态插入管理员
    public String insertWithParams(final Manager manager) {
        return new SQL() {
            {
                INSERT_INTO(MANAGERTABLE);
                if (manager.getName() != null && !manager.getName().equals("")) {
                    VALUES("name", "#{name}");
                }
                if (manager.getPassword() != null && !manager.getPassword().equals("")) {
                    VALUES("password", "#{password}");
                }
                if (manager.getStat() != null && !manager.getStat().equals("")) {
                    VALUES("stat", "#{stat}");
                }

            }
        }.toString();
    }

    //动态更新
    public String updateWithParams(final Manager manager) {
        return new SQL() {
            {
                UPDATE(MANAGERTABLE);
                if (manager.getName() != null && !manager.getName().equals("")) {
                    SET(" name=#{name}");
                }
                if (manager.getPassword() != null && !manager.getPassword().equals("")) {
                    SET(" password=#{password}");
                }
                if (manager.getStat() != null && !manager.getStat().equals("")) {
                    SET(" stat=#{stat}");
                }
                WHERE(" id=#{id}");
            }
        }.toString();
    }
}
