package xyz.bigtom.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>大汤姆旅游租赁平台-基础功能-基础视图信息</b>
 * <p>
 *     基础视图设定所有视图通用的属性，其它视图信息必须继承与本基础试图
 * </p>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("基础视图信息")
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 3573155779286107292L;
	@ApiModelProperty(value = "状态信息0-禁用，1-启用",dataType = "Integer",example = "1")
	private Integer status;                              //状态信息0-禁用，1-启用

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
