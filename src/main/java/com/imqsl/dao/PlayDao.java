package com.imqsl.dao;

import com.imqsl.dao.provider.PlayDynaSqlProvider;
import com.imqsl.domain.Play;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * Created by imqsl on 2017/9/11.
 */
public interface PlayDao {

    //动态查询
    @SelectProvider(type = PlayDynaSqlProvider.class, method = "selectWithParams")
    List<Play> dynaSelect(Play play);

    //动态删除
    @DeleteProvider(type = PlayDynaSqlProvider.class, method = "deleteWithParams")
    void dynadDelete(Play play);

    //动态插入
    @InsertProvider(type = PlayDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsert(Play play);

    //动态修改
    @UpdateProvider(type = PlayDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Play play);

}
