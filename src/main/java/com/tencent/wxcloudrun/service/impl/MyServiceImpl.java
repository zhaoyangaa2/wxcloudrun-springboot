package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tencent.wxcloudrun.controller.req.MyAddReq;
import com.tencent.wxcloudrun.controller.req.MyUpdateReq;
import com.tencent.wxcloudrun.dao.MyMapper;
import com.tencent.wxcloudrun.model.My;
import com.tencent.wxcloudrun.service.MyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyMapper myMapper;


    @Override
    public Optional<My> get(Integer id) {
        return Optional.of(myMapper.selectById(id));
    }


    @Override
    public void del(Integer id) {
        myMapper.deleteById(id);
    }

    @Override
    public Optional<List<My>> list() {
        return Optional.of(myMapper.selectList(new LambdaQueryWrapper<My>()));
    }

    @Override
    public void add(MyAddReq req) {
        My my = new My();
        BeanUtils.copyProperties(req, my);
        myMapper.insert(my);
    }

    @Override
    public void update(MyUpdateReq req) {
        My my = this.get(req.getId()).get();
        BeanUtils.copyProperties(req, my);
        myMapper.updateById(my);
    }

    @Override
    public void addViewTime(Integer id) {
        My my = this.get(id).get();
        my.setViewTime(my.getViewTime() + 1);
        myMapper.updateById(my);
    }
}
