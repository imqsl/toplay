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
                if (user.getStu_id() !=null && !user.getStu_id().equals("")) {
                    SET("stu_id=#{stu_id}");
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
                WHERE("user_id=#{user_id}");
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
                if (user.getStu_id() != null && !user.getStu_id().equals("")) {
                    VALUES("stu_id", "#{stu_id}");
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
                if (user.getStu_id() != null && !user.getStu_id().equals("")) {
                    WHERE(" stu_id LIKE CONCAT ('%',#{stu_id},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE(" username LIKE CONCAT ('%',#{username},'%')");
                }
                if (user.getUser_id() != null && !user.getUser_id().equals("")) {
                    WHERE(" user_id LIKE CONCAT ('%',#{user_id},'%')");
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
                if (user.getStu_id() != null && !user.getStu_id().equals("")) {
                    WHERE(" stu_id LIKE CONCAT ('%',#{stu_id},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE(" username LIKE CONCAT ('%',#{username},'%')");
                }
                if (user.getUser_id() != null && !user.getUser_id().equals("")) {
                    WHERE(" user_id LIKE CONCAT ('%',#{user_id},'%')");
                }
            }

        }.toString();
    }
}
