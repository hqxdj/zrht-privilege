package com.zrht.privilege.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("privilege")
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限id
     */
    @TableField("privilege_id")
    private String privilegeId;

    /**
     * 权限类型
     */
    @TableField("privilege_type")
    private Integer privilegeType;

    /**
     * 权限操作
     */
    @TableField("operate")
    private Integer operate;

    /**
     * 创建者id
     */
    @TableField("create_id")
    private String createId;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 更新者id
     */
    @TableField("update_id")
    private String updateId;

    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;

    public static final String ID = "id";

    public static final String PRIVILEGE_ID = "privilege_id";

    public static final String PRIVILEGE_TYPE = "privilege_type";

    public static final String OPERATE = "operate";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

}
