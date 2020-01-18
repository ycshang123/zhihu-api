package com.scs.soft.zhihu.api.entity;/*@ClassName RoundTable
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/17
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoundTable {
    private  Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
