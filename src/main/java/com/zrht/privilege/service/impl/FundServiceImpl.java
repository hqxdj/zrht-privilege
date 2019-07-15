package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.FundDao;
import com.zrht.privilege.entity.Fund;
import com.zrht.privilege.service.FundService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资金表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class FundServiceImpl extends ServiceImpl<FundDao, Fund> implements FundService {

}
