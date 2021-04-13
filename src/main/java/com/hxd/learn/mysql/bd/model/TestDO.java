package com.hxd.learn.mysql.bd.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * t_test
 *
 * @author huangxiaodong
 * @date 2021/3/31  11:44
 */
@TableName(value = "t_test")
@Data
@Builder
public class TestDO implements Serializable {
    /**
     *
     */
    @TableId
    private String id;

    /**
     *
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}