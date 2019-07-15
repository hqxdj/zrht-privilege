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
 * 用户表
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 上级用户id
     */
    @TableField("parent_user_id")
    private Integer parentUserId;

    /**
     * 所属支行
     */
    @TableField("bank_id")
    private String bankId;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 登录名
     */
    @TableField("loging_name")
    private String logingName;

    /**
     * 登录密码
     */
    @TableField("password")
    private String password;

    /**
     * 性别
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 版本
     */
    @TableField("ver")
    private Integer ver;

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

    @TableField("etc1")
    private String etc1;

    @TableField("etc2")
    private String etc2;

    @TableField("etc3")
    private String etc3;

    @TableField("etc4")
    private String etc4;


    public static final String USER_ID = "user_id";

    public static final String PARENT_USER_ID = "parent_user_id";

    public static final String BANK_ID = "bank_id";

    public static final String USER_NAME = "user_name";

    public static final String LOGING_NAME = "loging_name";

    public static final String PASSWORD = "password";

    public static final String SEX = "sex";

    public static final String VER = "ver";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

}
