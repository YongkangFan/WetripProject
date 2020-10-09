package xyz.bigtom.transport.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.bigtom.pojo.order.entity.OrderStatusRecord;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录传输层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "bigtom-order-provider")
@RequestMapping("/orderstatus/trans")
public interface OrderStatusRecordTransport {
	/**
	 * <b>保存订单状态</b>
	 * @param orderStatusRecord
	 * @return
	 */
	@PostMapping("/sava")
	boolean save(@RequestBody OrderStatusRecord orderStatusRecord) throws Exception;

}
