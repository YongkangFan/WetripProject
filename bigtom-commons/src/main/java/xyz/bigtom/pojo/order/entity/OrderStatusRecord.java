package xyz.bigtom.pojo.order.entity;

import xyz.bigtom.base.pojo.entity.BaseEntity;

/**
 * <b>汤姆旅游租赁平台-订单管理- 订单状态记录实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class OrderStatusRecord extends BaseEntity {
	private static final long serialVersionUID = -1684761340885177676L;
	private String id;                          //主键
	private Order order;                        //订单信息
	private String orderStatus;                 //订单状态
	private Integer statusCode;                 //订单编号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
}
