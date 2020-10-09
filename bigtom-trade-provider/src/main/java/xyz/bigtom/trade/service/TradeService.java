package xyz.bigtom.trade.service;

import xyz.bigtom.pojo.trade.entity.Trade;
import xyz.bigtom.pojo.trade.vo.AlipayTradeVO;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单支付业务层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public interface TradeService {

	/**
	 * <b>使用支付宝后，保存支付交易信息</b>
	 * @param trade
	 * @return
	 * @throws Exception
	 */
	boolean saveByAlipayTradeVO(Trade trade) throws Exception ;
}
