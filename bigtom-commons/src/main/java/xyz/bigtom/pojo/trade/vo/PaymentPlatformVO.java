package xyz.bigtom.pojo.trade.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
import xyz.bigtom.base.pojo.vo.BaseVO;
import xyz.bigtom.pojo.trade.entity.PaymentPlatform;

/**
 * <b>汤姆旅游租赁平台-支付管理-支付平台视图信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("汤姆旅游租赁平台-支付管理-支付平台视图信息")
public class PaymentPlatformVO extends BaseVO {
	private static final long serialVersionUID = 2238638727341420571L;
	@ApiModelProperty(value = "主键")
	private String  id;                 //主键
	@ApiModelProperty(value = "支付平台")
	private String platform;            //支付平台
	@ApiModelProperty(value = "平台图标")
	private String platformIcon;        //平台图标

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatformIcon() {
		return platformIcon;
	}

	public void setPlatformIcon(String platformIcon) {
		this.platformIcon = platformIcon;
	}

	/**
	 * <b>将 VO 对象转换成 Entity 对象</b>
	 * @param vo
	 * @return
	 */
	public static PaymentPlatform parseToEntity(PaymentPlatformVO vo) {
		PaymentPlatform entity = new PaymentPlatform();
		//将 VO 中属性提取，设定到 Entity 中
		//entity.setId(vo.getId());
		//借助于spring所提供的 Bean Utils 来拷贝属性
		BeanUtils.copyProperties(vo,entity);

		return entity;
	}
}
