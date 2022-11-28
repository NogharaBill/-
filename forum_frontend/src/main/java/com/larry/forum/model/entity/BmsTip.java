package com.larry.forum.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data  //自动生成get，set方法
@TableName("bms_tip")
@NoArgsConstructor  //生成无参构造方法
public class BmsTip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 作者
     */

    private String author;

    /**
     * 1：使用，0：过期
     */

    private boolean type;

}