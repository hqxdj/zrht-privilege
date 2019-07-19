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
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id

     */
    @TableField("user_id")
    private String userId;

    /**
     * 上级用户id
     */
    @TableField("parent_user_id")
    private String parentUserId;

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
    @TableField("login_name")
    private String loginName;

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
     * 状态 0-在职，1-离职
     */
    @TableField("status")
    private Integer status;

    /**
     * 账号是否可用 0-可用 1-禁用
     */
    @TableField("available")
    private Integer available;

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

    public static final String USER_ID = "user_id";

    public static final String PARENT_USER_ID = "parent_user_id";

    public static final String BANK_ID = "bank_id";

    public static final String USER_NAME = "user_name";

    public static final String LOGIN_NAME = "login_name";

    public static final String PASSWORD = "password";

    public static final String SEX = "sex";

    public static final String STATUS = "status";

    public static final String AVAILABLE = "available";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

}
