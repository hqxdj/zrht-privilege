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
 * 权限菜单表
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单id
     */
    @TableField("menu_id")
    private String menuId;

    /**
     *  菜单名称
     */
    @TableField("menu_name")
    private String menuName;

    /**
     * 菜单url
     */
    @TableField("menu_url")
    private String menuUrl;

    /**
     * 父类菜单id
     */
    @TableField("parent_menu_id")
    private String parentMenuId;

    @TableField("create_id")
    private String createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("upate_id")
    private String upateId;

    @TableField("udate_date")
    private Date udateDate;


    public static final String ID = "id";

    public static final String MENU_ID = "menu_id";

    public static final String MENU_NAME = "menu_name";

    public static final String MENU_URL = "menu_url";

    public static final String PARENT_MENU_ID = "parent_menu_id";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPATE_ID = "upate_id";

    public static final String UDATE_DATE = "udate_date";

}
