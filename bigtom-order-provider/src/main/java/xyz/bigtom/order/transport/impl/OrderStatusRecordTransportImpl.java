package xyz.bigtom.order.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bigtom.order.service.OrderStatusRecordService;
import xyz.bigtom.pojo.order.entity.OrderStatusRecord;
import xyz.bigtom.transport.order.OrderStatusRecordTransport;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录传输层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("orderStatusRecordTransport")
@RequestMapping("/orderstatus/trans")
public class OrderStatusRecordTransportImpl implements OrderStatusRecordTransport {
	@Autowired
	private OrderStatusRecordService service;
	/**
	 * <b>保存订单状态</b>
	 * @param orderStatusRecord
	 * @return
	 */
	@PostMapping("/sava")
	@Override
	public boolean save(@RequestBody OrderStatusRecord orderStatusRecord) throws Exception {
		return service.save(orderStatusRecord);
	}
}
