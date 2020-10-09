package xyz.bigtom.order.dao;

import org.springframework.stereotype.Repository;
import xyz.bigtom.pojo.order.entity.Order;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单信息数据持久层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface OrderDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Order> findListByQuery(Order query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer save(Order entity) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer update(Order entity) throws Exception;
}
