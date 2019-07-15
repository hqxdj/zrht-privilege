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
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menu_privilege")
public class MenuPrivilege implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限菜单id
     */
    @TableId(value = "menu_privilege_id", type = IdType.AUTO)
    private Integer menuPrivilegeId;

    /**
     * 菜单id
     */
    @TableField("menu_id")
    private Integer menuId;

    /**
     * 权限id
     */
    @TableField("privilege_id")
    private Integer privilegeId;

    @TableField("ver")
    private String ver;

    @TableField("create_id")
    private Integer createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("upadte_id")
    private Integer upadteId;

    @TableField(" update_date")
    private Date updateDate;

    @TableField("etc1")
    private String etc1;

    @TableField("etc2")
    private String etc2;

    @TableField("etc3")
    private String etc3;

    @TableField("etc4")
    private String etc4;


    public static final String MENU_PRIVILEGE_ID = "menu_privilege_id";

    public static final String MENU_ID = "menu_id";

    public static final String PRIVILEGE_ID = "privilege_id";

    public static final String VER = "ver";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPADTE_ID = "upadte_id";

    public static final String UPDATE_DATE = " update_date";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

}
