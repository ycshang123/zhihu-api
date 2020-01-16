package com.scs.soft.zhihu.api.entity;/*@ClassName Special
 *@Description:知乎专题实体类
 *@author yc_shang
 *@Date2020/1/15
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
