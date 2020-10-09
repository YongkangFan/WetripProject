package xyz.bigtom.transport.trade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.bigtom.pojo.trade.entity.Trade;
import xyz.bigtom.pojo.trade.vo.AlipayTradeVO;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单支付传输层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "bigtom-trade-provider")
@RequestMapping("/trade/trans")
public interface TradeTransport {

	/**
	 * <b>使用支付宝后，保存支付交易信息</b>
	 * @param trade
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save/alipay")
	boolean saveByAlipayTradeVO(@RequestBody Trade trade) throws Exception ;
}
