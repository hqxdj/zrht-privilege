package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.UserRoleDao;
import com.zrht.privilege.entity.UserRole;
import com.zrht.privilege.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户_角色关联表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}
