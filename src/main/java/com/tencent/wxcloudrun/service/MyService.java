package com.tencent.wxcloudrun.service;


import com.tencent.wxcloudrun.controller.req.MyAddReq;
import com.tencent.wxcloudrun.controller.req.MyUpdateReq;
import com.tencent.wxcloudrun.model.My;

import java.util.List;
import java.util.Optional;

public interface MyService {


    Optional<My> get(Integer id);

    void del(Integer id);

    Optional<List<My>> list();

    void add(MyAddReq req);

    void update(MyUpdateReq req);

    void addViewTime(Integer id);
}
