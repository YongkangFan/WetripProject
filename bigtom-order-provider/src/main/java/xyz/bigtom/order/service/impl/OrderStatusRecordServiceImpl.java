package xyz.bigtom.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.bigtom.order.dao.OrderStatusRecordDao;
import xyz.bigtom.order.service.OrderStatusRecordService;
import xyz.bigtom.pojo.order.entity.OrderStatusRecord;
import xyz.bigtom.util.IdGenerator;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录业务层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("orderStatusRecordService")
@Transactional
public class OrderStatusRecordServiceImpl implements OrderStatusRecordService {
	@Autowired
	private OrderStatusRecordDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>保存订单状态</b>
	 * @param orderStatusRecord
	 * @return
	 */
	@Override
	public boolean save(OrderStatusRecord orderStatusRecord) throws Exception {
		//设定参数id
		orderStatusRecord.setId(idGenerator.createId());
		//保存数据
		Integer count = dao.save(orderStatusRecord);
		if (count > 0) {
			return true;
		}
		return false;
	}
}
