package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.ProductDao;
import com.zrht.privilege.entity.Product;
import com.zrht.privilege.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {

}
