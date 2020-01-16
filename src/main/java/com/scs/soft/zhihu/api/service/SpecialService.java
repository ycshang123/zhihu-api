package com.scs.soft.zhihu.api.service;/*@ClassName SpecialService
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/16
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 */
public interface SpecialService {
    List<Map> selectAll();
    List<Special> selectRecent();

}
