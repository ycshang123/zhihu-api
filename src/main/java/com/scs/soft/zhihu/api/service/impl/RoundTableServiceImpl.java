package com.scs.soft.zhihu.api.service.impl;/*@ClassName RoundTableServiceImpl
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/17
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<Map> sellectAll() {
       return roundTableMapper.selectAll();
    }

    @Override
    public List<RoundTable> selectRecent() {
        return  roundTableMapper.selectRecent();
    }
}
