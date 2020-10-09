package xyz.bigtom.transport.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.bigtom.pojo.order.entity.Order;

/**
 * <b>汤姆旅游租赁平台-支付管理-订单信息传输层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "bigtom-trade-provider")
@RequestMapping("/order/trans")
public interface OrderTransport {
	/**
	 * <b>根据 orderNo 订单编号 查询订单信息</b>
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/orderNo")
	Order getOrderByOrderNo(@RequestParam String orderNo) throws Exception;
}
