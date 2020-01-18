package com.scs.soft.zhihu.api.service;/*@ClassName RoundTableService
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/17
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

public interface RoundTableService {
    List<Map> sellectAll();
    List<RoundTable> selectRecent();
}
