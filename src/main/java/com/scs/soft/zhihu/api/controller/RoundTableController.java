package com.scs.soft.zhihu.api.controller;/*@ClassName RoundTableController
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/17
 *@Version 1.0
 **/

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value ="/api/table")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;
    @GetMapping
    public  Result getRecent(){
        return  Result.success(roundTableService.selectRecent());
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return  Result.success(roundTableService.sellectAll());
    }

}
