package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.CustomerDao;
import com.zrht.privilege.entity.Customer;
import com.zrht.privilege.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerDao, Customer> implements CustomerService {

}
