package com.imqsl.dao;

import com.imqsl.dao.provider.PlayDynaSqlProvider;
import com.imqsl.domain.Play;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.PLAYTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public interface PlayDao {

    //根据id查询
    @Select("select * from "+PLAYTABLE+" where id=#{id}")
    Play selectById(Integer id);

    //根据id删除
    @Delete("delete from "+PLAYTABLE+" where id=#{id}")
    void deleteById(Integer id);

    //动态查询
    @SelectProvider(type = PlayDynaSqlProvider.class, method = "selectWithParams")
    List<Play> selectWithParams(Play play);

    //动态删除
    @DeleteProvider(type = PlayDynaSqlProvider.class, method = "deleteWithParams")
    void delete(Play play);

    //动态插入
    @InsertProvider(type = PlayDynaSqlProvider.class, method = "insertWithParams")
    void insert(Play play);

    //动态修改
    @UpdateProvider(type = PlayDynaSqlProvider.class, method = "updateWithParams")
    void update(Play play);

}
