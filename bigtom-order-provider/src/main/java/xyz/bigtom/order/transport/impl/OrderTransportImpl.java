package xyz.bigtom.order.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.bigtom.order.service.OrderService;
import xyz.bigtom.pojo.order.entity.Order;
import xyz.bigtom.transport.order.OrderTransport;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单信息传输层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("orderTransport")
@RequestMapping("/order/trans")
public class OrderTransportImpl implements OrderTransport {
	@Autowired
	private OrderService orderService;
	/**
	 * <b>根据 orderNo 订单编号 查询订单信息</b>
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/orderNo")
	@Override
	public Order getOrderByOrderNo(@RequestParam String orderNo) throws Exception {
		return orderService.getOrderByOrderNo(orderNo);
	}
}
