package com.zrht.privilege.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 资金表
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fund")
public class Fund implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存款id
     */
    @TableId(value = "fund_id", type = IdType.AUTO)
    private Integer fundId;

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

    /**
     * 客户id
     */
    @TableField("customer_id")
    private Integer customerId;

    /**
     * 存款类型
     */
    @TableField("fund_type_id")
    private Integer fundTypeId;

    /**
     * 初始金额
     */
    @TableField("amout")
    private BigDecimal amout;

    /**
     * 币种
     */
    @TableField("currency_type")
    private Integer currencyType;

    /**
     * 过期时间
     */
    @TableField("expire_date")
    private Date expireDate;

    /**
     * 付息率
     */
    @TableField("rate")
    private String rate;

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


    public static final String FUND_ID = "fund_id";

    public static final String VER = "ver";

    public static final String CREATE_ID = "create_id";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_ID = "update_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String CUSTOMER_ID = "customer_id";

    public static final String FUND_TYPE_ID = "fund_type_id";

    public static final String AMOUT = "amout";

    public static final String CURRENCY_TYPE = "currency_type";

    public static final String EXPIRE_DATE = "expire_date";

    public static final String RATE = "rate";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

    public static final String ETC5 = "etc5";

    public static final String ETC6 = "etc6";

}
