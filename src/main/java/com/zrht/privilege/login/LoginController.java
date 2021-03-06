package com.zrht.privilege.login;

import com.cloud.common.bean.ResponseInfo;
import com.cloud.common.controller.BaseController;
import com.cloud.common.util.ResultUtils;
import com.zrht.privilege.dto.UserInfoParamDTO;
import com.zrht.privilege.shiro.CustomUsernamePasswordToken;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController extends BaseController {

    /**
     * @param
     * @return com.zrht.privilege.common.Response
     * @author xdj
     * @data 2019/7/22
     */
    @PostMapping("/login")
    public ResponseInfo login(@RequestBody UserInfoParamDTO user) {

//        HttpSession session = request.getSession();
//        session.setAttribute("user", user);
        CustomUsernamePasswordToken token = new CustomUsernamePasswordToken(user.getLoginName(), user.getPassword().toCharArray(), user.getRoleId());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResultUtils.failure();
        }

        return ResultUtils.success();
    }

    @PostMapping("/access")
    @RequiresPermissions("/access")
    public ResponseInfo access() {
        System.out.println("access success");
        return ResultUtils.success();
    }

}
