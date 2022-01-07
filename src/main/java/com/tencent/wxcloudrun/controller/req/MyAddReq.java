package com.tencent.wxcloudrun.controller.req;

import lombok.Data;

@Data
public class MyAddReq {
    private String title;
    private String content;
    private Integer proficiency;

}
