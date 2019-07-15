package com.zrht.privilege.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * config_info
 * </p>
 *
 * @author hzc
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ConfigInfo implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * data_id
     */
    @TableField("data_id")
    private String dataId;

    @TableField("group_id")
    private String groupId;

    /**
     * content
     */
    @TableField("content")
    private String content;

    /**
     * md5
     */
    @TableField("md5")
    private String md5;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @TableField("gmt_modified")
    private Date gmtModified;

    /**
     * source user
     */
    @TableField("src_user")
    private String srcUser;

    /**
     * source ip
     */
    @TableField("src_ip")
    private String srcIp;

    @TableField("app_name")
    private String appName;

    /**
     * 租户字段
     */
    @TableField("tenant_id")
    private String tenantId;

    @TableField("c_desc")
    private String cDesc;

    @TableField("c_use")
    private String cUse;

    @TableField("effect")
    private String effect;

    @TableField("type")
    private String type;

    @TableField("c_schema")
    private String cSchema;


    public static final String ID = "id";

    public static final String DATA_ID = "data_id";

    public static final String GROUP_ID = "group_id";

    public static final String CONTENT = "content";

    public static final String MD5 = "md5";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String SRC_USER = "src_user";

    public static final String SRC_IP = "src_ip";

    public static final String APP_NAME = "app_name";

    public static final String TENANT_ID = "tenant_id";

    public static final String C_DESC = "c_desc";

    public static final String C_USE = "c_use";

    public static final String EFFECT = "effect";

    public static final String TYPE = "type";

    public static final String C_SCHEMA = "c_schema";

}
