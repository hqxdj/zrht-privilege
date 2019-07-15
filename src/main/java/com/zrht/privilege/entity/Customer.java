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
 * 客户表
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("create_date")
    private Date createDate;

    @TableField("create_id")
    private Integer createId;

    @TableField("update_date")
    private Date updateDate;

    @TableField("update_id")
    private Integer updateId;

    @TableField("ver")
    private String ver;

    @TableId(value = "customer_id", type = IdType.AUTO)
    private Integer customerId;

    /**
     * 客户名称
     */
    @TableField("customer_name")
    private String customerName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 所属银行
     */
    @TableField("bank_id")
    private Integer bankId;

    /**
     * 所属客户经理id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 余额
     */
    @TableField("store_balance")
    private BigDecimal storeBalance;

    /**
     * 贷款
     */
    @TableField("debt_balance")
    private BigDecimal debtBalance;

    /**
     * 中收
     */
    @TableField("income")
    private BigDecimal income;

    /**
     * 创利
     */
    @TableField("profit")
    private BigDecimal profit;

    /**
     * 结算笔数
     */
    @TableField("account_number")
    private Long accountNumber;

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


    public static final String CREATE_DATE = "create_date";

    public static final String CREATE_ID = "create_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String UPDATE_ID = "update_id";

    public static final String VER = "ver";

    public static final String CUSTOMER_ID = "customer_id";

    public static final String CUSTOMER_NAME = "customer_name";

    public static final String PASSWORD = "password";

    public static final String ADDRESS = "address";

    public static final String BANK_ID = "bank_id";

    public static final String USER_ID = "user_id";

    public static final String STORE_BALANCE = "store_balance";

    public static final String DEBT_BALANCE = "debt_balance";

    public static final String INCOME = "income";

    public static final String PROFIT = "profit";

    public static final String ACCOUNT_NUMBER = "account_number";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

    public static final String ETC5 = "etc5";

    public static final String ETC6 = "etc6";

}
