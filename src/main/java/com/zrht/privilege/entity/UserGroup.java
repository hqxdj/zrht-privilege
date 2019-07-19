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
 * 用户组
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_group")
public class UserGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户组id
     */
    @TableField("user_group_id")
    private String userGroupId;

    /**
     * 用户组名称
     */
    @TableField("user_group_name")
    private String userGroupName;

    /**
     * 父类组的id
     */
    @TableField("parent_group_id")
    private String parentGroupId;

    @TableField("create_id")
    private Integer createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_id")
    private String updateId;

    @TableField("upate_date")
    private Date upateDate;


    public static final String ID = "id";

    public static final String USER_GROUP_ID = "user_group_id";

    public static final String USER_GROUP_NAME = "user_group_name";

    public static final String PARENT_GROUP_ID = "parent_group_id";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPATE_DATE = "upate_date";

}
