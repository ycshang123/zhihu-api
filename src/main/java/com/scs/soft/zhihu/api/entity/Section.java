package com.scs.soft.zhihu.api.entity;/*@ClassName Section
 *@Description:todo
 *@author yc_shang
 *@Date2020/1/15
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
