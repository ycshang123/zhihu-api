package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private  RoundTableMapper roundTableMapper;
    @Test
    void selectAll() {
        List<Map> tables = roundTableMapper.selectAll();
        tables.forEach(System.out::println);
    }
}