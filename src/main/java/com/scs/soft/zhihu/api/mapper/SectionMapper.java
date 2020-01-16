package com.scs.soft.zhihu.api.mapper;/*@ClassName SectionMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/16
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SectionMapper {
    /*
    * 根据文章id查询标签列表
    * */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);
}
