package xyz.bigtom.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.bigtom.order.dao.OrderDao;
import xyz.bigtom.order.service.OrderService;
import xyz.bigtom.pojo.order.entity.Order;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单信息业务层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao dao;
	/**
	 * <b>根据 orderNo 订单编号 查询订单信息</b>
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	@Override
	public Order getOrderByOrderNo(String orderNo) throws Exception {
		//创建查询对象
		Order query = new Order();
		query.setOrderNo(orderNo);

		//进行查询列表
		List<Order> list = dao.findListByQuery(query);
		//提取数据
		if(list != null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
