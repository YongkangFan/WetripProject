package xyz.bigtom.pojo.order.entity;

import xyz.bigtom.base.pojo.entity.BaseEntity;

/**
 * <b>汤姆旅游租赁平台-订单管理-订单实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class Order extends BaseEntity {
	private static final long serialVersionUID = 7457689923187326942L;
	private String id;                      //订单主键
	private String orderNo;                //订单编号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}
