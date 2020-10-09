package xyz.bigtom.trade.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.bigtom.pojo.order.entity.Order;
import xyz.bigtom.pojo.trade.entity.Trade;
import xyz.bigtom.pojo.trade.vo.AlipayTradeVO;
import xyz.bigtom.trade.dao.TradeDao;
import xyz.bigtom.trade.service.TradeService;
import xyz.bigtom.util.IdGenerator;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单支付业务层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("tradeService")
@Transactional
public class TradeServiceImpl implements TradeService {
	@Autowired
	private TradeDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>使用支付宝后，保存支付交易信息</b>
	 * @param trade
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean saveByAlipayTradeVO(Trade trade) throws Exception {
		//设定主键
		trade.setId(idGenerator.createId());
		//保存订单信息
		Integer count = dao.save(trade);
		if(count != null && count>0){
			return true;
		}
		return false;
	}
}
