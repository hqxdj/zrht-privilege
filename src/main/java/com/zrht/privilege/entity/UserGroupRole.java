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
 * 用户组_角色关联表
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_group_role")
public class UserGroupRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户组_角色id
     */
    @TableField("relation_id")
    private String relationId;

    /**
     * 用户组id
     */
    @TableField("user_group_id")
    private String userGroupId;

    /**
     * 角色id
     */
    @TableField("role_id")
    private String roleId;

    @TableField("create_id")
    private String createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_id")
    private String updateId;

    @TableField("update_date")
    private Date updateDate;


    public static final String ID = "id";

    public static final String RELATION_ID = "relation_id";

    public static final String USER_GROUP_ID = "user_group_id";

    public static final String ROLE_ID = "role_id";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

}
