package com.tencent.wxcloudrun.model;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BaseEntity<T extends Model<?>> extends Model<T> {


    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Date createTime;
    private Date updateTime;


    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
