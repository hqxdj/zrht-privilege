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
 * 用户与用户组的关系表
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_u_group")
public class UserUGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关系id
     */
    @TableField("user_relation_id")
    private String userRelationId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 用户组id
     */
    @TableField("user_group_id")
    private String userGroupId;

    @TableField("create_date")
    private Date createDate;

    @TableField("create_id")
    private Integer createId;

    @TableField("update_date")
    private Date updateDate;

    @TableField("update_id")
    private Integer updateId;


    public static final String ID = "id";

    public static final String USER_RELATION_ID = "user_relation_id";

    public static final String USER_ID = "user_id";

    public static final String USER_GROUP_ID = "user_group_id";

    public static final String CREATE_DATE = "create_date";

    public static final String CREATE_ID = "create_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String UPDATE_ID = "update_id";

}
