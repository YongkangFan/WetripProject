package xyz.bigtom.trade.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bigtom.pojo.trade.entity.Trade;
import xyz.bigtom.pojo.trade.vo.AlipayTradeVO;
import xyz.bigtom.trade.service.TradeService;
import xyz.bigtom.transport.trade.TradeTransport;

import javax.xml.ws.Service;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单支付传输层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("tradeTransport")
@RequestMapping("/trade/trans")
public class TradeTransportImpl implements TradeTransport {
	@Autowired
	private TradeService service;
	/**
	 * <b>使用支付宝后，保存支付交易信息</b>
	 * @param alipayTradeVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save/alipay")
	@Override
	public boolean saveByAlipayTradeVO(@RequestBody Trade trade) throws Exception {
		return service.saveByAlipayTradeVO(trade);
	}
}
