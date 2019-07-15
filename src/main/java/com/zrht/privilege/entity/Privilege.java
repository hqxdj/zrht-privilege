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
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("privilege")
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
    @TableId(value = "privilege_id", type = IdType.AUTO)
    private Integer privilegeId;

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
    private Integer createId;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 更新者id
     */
    @TableField("update_id")
    private Integer updateId;

    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;

    /**
     * 版本
     */
    @TableField("ver")
    private Integer ver;

    @TableField("etc1")
    private String etc1;

    @TableField("etc2")
    private String etc2;

    @TableField("etc3")
    private String etc3;

    @TableField("etc4")
    private String etc4;


    public static final String PRIVILEGE_ID = "privilege_id";

    public static final String PRIVILEGE_TYPE = "privilege_type";

    public static final String OPERATE = "operate";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String VER = "ver";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

}
