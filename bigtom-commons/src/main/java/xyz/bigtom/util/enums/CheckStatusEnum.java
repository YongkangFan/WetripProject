package xyz.bigtom.util.enums;

/**
 * <b>汤姆旅游租赁平台-支付管理- 审核状态枚举信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */

public enum CheckStatusEnum {
	CHECK_STATUS_PENDING(0,"待审核"),
	CHECK_STATUS_SUCCESS(1,"审核通过"),
	CHECK_STATUS_FAILURE(2,"审核失败");

	private Integer code;               //系审核码
	private String remark;              //系统状态说明

	private CheckStatusEnum(Integer code, String remark){
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
