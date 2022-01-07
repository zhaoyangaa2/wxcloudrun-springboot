package com.tencent.wxcloudrun.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("my")
public class My extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String title;
    private String content;
    private Integer proficiency;
    private Integer viewTime;


}
