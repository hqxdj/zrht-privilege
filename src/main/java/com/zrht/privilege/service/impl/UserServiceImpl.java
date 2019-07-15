package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.UserDao;
import com.zrht.privilege.entity.User;
import com.zrht.privilege.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
