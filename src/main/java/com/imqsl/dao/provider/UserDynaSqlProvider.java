package com.imqsl.dao.provider;

import com.imqsl.domain.User;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.USERTABLE;


/**
 * Created by imqsl on 2017/9/8.
 */
public class UserDynaSqlProvider {
    //动态修改用户
    public String dynaUpdate(final User user) {
        return new SQL() {
            {
                UPDATE(USERTABLE);
                if (user.getGender() != null && !user.getGender().equals("")) {
                    SET("gender=#{gender}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    SET("username=#{username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    SET("password=#{password}");
                }
                if (user.getStuId() != null && !user.getStuId().equals("")) {
                    SET("stu_id=#{stuId}");
                }
                if (user.getPhone() != null && !user.getPhone().equals("")) {
                    SET("phone=#{phone}");
                }
                if (user.getAddress() != null && !user.getAddress().equals("")) {
                    SET("address=#{address}");
                }
                if (user.getCollege() != null && !user.getCollege().equals("")) {
                    SET("college=#{college}");
                }
                if (user.getCredit() != null && !user.getCredit().equals("")) {
                    SET("credit=#{credit}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

    //动态插入
    public String dynaInsert(final User user) {
        return new SQL() {
            {
                INSERT_INTO(USERTABLE);
                if (user.getGender() != null && !user.getGender().equals("")) {
                    VALUES("gender", "#{gender}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    VALUES("username", "#{username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    VALUES("password", "#{password}");
                }
                if (user.getStuId() != null && !user.getStuId().equals("")) {
                    VALUES("stu_id", "#{stuId}");
                }
                if (user.getPhone() != null && !user.getPhone().equals("")) {
                    VALUES("phone", "#{phone}");
                }
                if (user.getAddress() != null && !user.getAddress().equals("")) {
                    VALUES("address", "#{address}");
                }
                if (user.getCollege() != null && !user.getCollege().equals("")) {
                    VALUES("college", "#{college}");
                }
                if (user.getCredit() != null && !user.getCredit().equals("")) {
                    VALUES("credit", "#{credit}");
                }

            }

        }.toString();
    }

    //动态查询
    public String dynaSelect(final User user) {
        return new SQL() {
            {
                SELECT("*");
                FROM(USERTABLE);
                if (user.getCollege() != null && !user.getCollege().equals("")) {
                    WHERE(" college LIKE CONCAT ('%',#{college},'%')");
                }
                if (user.getPhone() != null && !user.getPhone().equals("")) {
                    WHERE(" phone LIKE CONCAT ('%',#{phone},'%')");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    WHERE(" gender LIKE CONCAT ('%',#{gender},'%')");
                }
                if (user.getStuId() != null && !user.getStuId().equals("")) {
                    WHERE(" stu_id LIKE CONCAT ('%',#{stuId},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE(" username LIKE CONCAT ('%',#{username},'%')");
                }

            }

        }
                .toString();
    }

    //动态查询用户总数量
    public String count(final User user) {
        return new SQL() {
            {
                SELECT("count(*)");
                FROM(USERTABLE);
                if (user.getAddress() != null && !user.getAddress().equals("")) {
                    WHERE(" address LIKE CONCAT ('%',#{address},'%')");
                }
                if (user.getCollege() != null && !user.getCollege().equals("")) {
                    WHERE(" college LIKE CONCAT ('%',#{college},'%')");
                }
                if (user.getPhone() != null && !user.getPhone().equals("")) {
                    WHERE(" phone LIKE CONCAT ('%',#{phone},'%')");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    WHERE(" gender LIKE CONCAT ('%',#{gender},'%')");
                }
                if (user.getStuId() != null && !user.getStuId().equals("")) {
                    WHERE(" stu_id LIKE CONCAT ('%',#{stuId},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE(" username LIKE CONCAT ('%',#{username},'%')");
                }
                if (user.getId() != null && !user.getId().equals("")) {
                    WHERE(" id LIKE CONCAT ('%',#{id},'%')");
                }
            }

        }.toString();
    }
}
