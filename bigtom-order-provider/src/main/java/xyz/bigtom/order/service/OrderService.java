package xyz.bigtom.order.service;

import xyz.bigtom.pojo.order.entity.Order;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单信息业务层层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public interface OrderService {
	/**
	 * <b>根据 orderNo 订单编号 查询订单信息</b>
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	Order getOrderByOrderNo(String orderNo) throws Exception ;
}
