package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.controller.req.MyAddReq;
import com.tencent.wxcloudrun.controller.req.MyUpdateReq;
import com.tencent.wxcloudrun.model.My;
import com.tencent.wxcloudrun.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * counter控制器
 */
@RestController
@Slf4j
public class MyController {

    @Autowired
    MyService myService;


    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @GetMapping(value = "/api/my/get/{id}")
    ApiResponse get(@PathVariable Integer id) {
        Optional<My> my = myService.get(id);
        if (my.isPresent()) {
            myService.addViewTime(id);
            return ApiResponse.ok(my);
        }

        return ApiResponse.error("对象不存在");
    }

    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @GetMapping(value = "/api/my/list")
    ApiResponse list() {
        Optional<List<My>> my = myService.list();
        if (my.isPresent()) {
            return ApiResponse.ok(my.get());
        }
        return ApiResponse.ok(new ArrayList<>());
    }

    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @PostMapping(value = "/api/my/add")
    ApiResponse add(@RequestBody MyAddReq req) {
        myService.add(req);
        return ApiResponse.ok();
    }

    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @PostMapping(value = "/api/my/update")
    ApiResponse update(@RequestBody MyUpdateReq req) {
        myService.update(req);
        return ApiResponse.ok();
    }

    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @GetMapping(value = "/api/my/del/{id}")
    ApiResponse del(@PathVariable Integer id) {
        myService.del(id);
        return ApiResponse.ok();
    }

}