package xyz.bigtom.trade.dao;

import org.springframework.stereotype.Repository;
import xyz.bigtom.pojo.trade.entity.Trade;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理-交易信息数据持久层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface TradeDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Trade> findListByQuery(Trade query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer save(Trade entity) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer update(Trade entity) throws Exception;
}
