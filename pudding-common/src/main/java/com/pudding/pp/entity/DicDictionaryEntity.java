package com.pudding.pp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据字典表
 * </p>
 *
 * @author LIMENGJIE
 * @since 2022-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_dic_dictionary")
public class DicDictionaryEntity implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId("code")
    private String code;

    /**
     * 定义编码
     */
    @TableField("p_code")
    private String pCode;

    /**
     * 系统编码
     */
    @TableField("sys_code")
    private String sysCode;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 排序
     */
    @TableField("order_id")
    private Integer orderId;

    /**
     * 描述
     */
    @TableField("descrip")
    private String descrip;

    /**
     * 创建人
     */
    @TableField("create_uid")
    private Long createUid;

    /**
     * 创建时间
     */
    @TableField("create_tm")
    private LocalDateTime createTm;

    /**
     * 更新人
     */
    @TableField("update_uid")
    private Long updateUid;

    /**
     * 更新时间
     */
    @TableField("update_tm")
    private LocalDateTime updateTm;

    /**
     * 删除标识
     */
    @TableField("del_flag")
    private Integer delFlag;


}
