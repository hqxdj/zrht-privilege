package com.zrht.privilege.dto;

import com.zrht.privilege.entity.UserInfo;
import lombok.Data;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 入参
 * @Date 2019/7/22 16:14
 * Copyright (c)   xdj
 */

@Data
public class UserInfoParamDTO extends UserInfo {

    private String roleId;
}
