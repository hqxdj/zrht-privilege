package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.BankDao;
import com.zrht.privilege.entity.Bank;
import com.zrht.privilege.service.BankService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存款方式 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class BankServiceImpl extends ServiceImpl<BankDao, Bank> implements BankService {

}
