package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.MenuDao;
import com.zrht.privilege.entity.Menu;
import com.zrht.privilege.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限菜单表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

}
