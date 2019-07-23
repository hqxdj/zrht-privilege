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
 * 
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menu_privilege")
public class MenuPrivilege implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限菜单id
     */
    @TableField("menu_privilege_id")
    private String menuPrivilegeId;

    /**
     * 菜单id
     */
    @TableField("menu_id")
    private String menuId;

    /**
     * 权限id
     */
    @TableField("privilege_id")
    private String privilegeId;

    @TableField("create_id")
    private String createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_id")
    private String updateId;

    @TableField("update_date")
    private Date updateDate;


    public static final String ID = "id";

    public static final String MENU_PRIVILEGE_ID = "menu_privilege_id";

    public static final String MENU_ID = "menu_id";

    public static final String PRIVILEGE_ID = "privilege_id";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

}
