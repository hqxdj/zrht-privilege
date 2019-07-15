package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.UserUGroupDao;
import com.zrht.privilege.entity.UserUGroup;
import com.zrht.privilege.service.UserUGroupService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与用户组的关系表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class UserUGroupServiceImpl extends ServiceImpl<UserUGroupDao, UserUGroup> implements UserUGroupService {

}
