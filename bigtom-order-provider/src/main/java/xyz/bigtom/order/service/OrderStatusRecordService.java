package xyz.bigtom.order.service;

import xyz.bigtom.pojo.order.entity.OrderStatusRecord;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录业务层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public interface OrderStatusRecordService {
	/**
	 * <b>保存订单状态</b>
	 * @param orderStatusRecord
	 * @return
	 */
	boolean save(OrderStatusRecord orderStatusRecord) throws Exception;
}
