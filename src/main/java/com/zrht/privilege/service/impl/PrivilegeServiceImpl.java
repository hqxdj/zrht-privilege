package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.PrivilegeDao;
import com.zrht.privilege.entity.Privilege;
import com.zrht.privilege.service.PrivilegeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Service
public class PrivilegeServiceImpl extends ServiceImpl<PrivilegeDao, Privilege> implements PrivilegeService {

}
