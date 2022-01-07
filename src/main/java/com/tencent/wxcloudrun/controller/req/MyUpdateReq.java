package com.tencent.wxcloudrun.controller.req;

import lombok.Data;

@Data
public class MyUpdateReq {
    private Integer id;
    private String title;
    private String content;
    private Integer proficiency;

}
