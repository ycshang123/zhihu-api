package com.scs.soft.zhihu.api.mapper;/*@ClassName RoundTableMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/17
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoundTableMapper {
    @Select("SELECT * FROM t_round_table")
    @Results({
        @Result(id = true, property = "name", column = "name", javaType = String.class),
        @Result(property = "banner", column = "banner", javaType = String.class),
        @Result(property = "urlToken", column = "url_token", javaType = String.class),
        @Result(property = "visitsCount",column = "visits_count", javaType = Integer.class),
        @Result(property = "includeCount",column = "include_count",javaType = Integer.class)
    })

    List<Map> selectAll();
    @Select("SELECT * FROM t_round_table LIMIT 0,4")
    List<RoundTable> selectRecent();

}
