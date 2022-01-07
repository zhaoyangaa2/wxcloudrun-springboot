package com.tencent.wxcloudrun.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.model.My;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyMapper extends BaseMapper<My> {


//    My get(@Param("id") Integer id);

//    List<My> list(@Param("title") String title);

//    void del(@Param("id") Integer id);

//    void update(@Param("my") My my);

//    void insert(@Param("my") My my);

}
