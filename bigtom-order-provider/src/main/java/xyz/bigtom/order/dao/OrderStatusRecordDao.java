package xyz.bigtom.order.dao;

import org.springframework.stereotype.Repository;
import xyz.bigtom.pojo.order.entity.OrderStatusRecord;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录数据持久层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface OrderStatusRecordDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<OrderStatusRecord> findListByQuery(OrderStatusRecord query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer save(OrderStatusRecord entity) throws Exception;
}
