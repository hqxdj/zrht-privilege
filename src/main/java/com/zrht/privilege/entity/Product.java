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
 * 产品表
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer productId;

    /**
     * 描述
     */
    @TableField("product_desc")
    private String productDesc;

    /**
     * 详情
     */
    @TableField("product_detail")
    private String productDetail;

    /**
     * 所属分行
     */
    @TableField("bank_id")
    private Integer bankId;

    @TableField("ver")
    private String ver;

    @TableField("create_id")
    private Integer createId;

    @TableField("create_date")
    private Date createDate;

    @TableField("update_id")
    private Integer updateId;

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

    @TableField("etc5")
    private String etc5;

    @TableField("etc6")
    private String etc6;


    public static final String PRODUCT_ID = "product_id";

    public static final String PRODUCT_DESC = "product_desc";

    public static final String PRODUCT_DETAIL = "product_detail";

    public static final String BANK_ID = "bank_id";

    public static final String VER = "ver";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

    public static final String ETC5 = "etc5";

    public static final String ETC6 = "etc6";

}
