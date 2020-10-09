package xyz.bigtom.pojo.trade.entity;

import org.springframework.beans.BeanUtils;
import xyz.bigtom.base.pojo.entity.BaseEntity;
import xyz.bigtom.pojo.trade.vo.PaymentPlatformVO;

/**
 * <b>汤姆旅游租赁平台-支付管理-支付平台实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class PaymentPlatform extends BaseEntity {
	private static final long serialVersionUID = -7829255974332928508L;
	private String  id;                 //主键
	private String platform;            //支付平台
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
	 * <b>将 Entity 对象转换成 VO 对象</b>
	 * @param entity
	 * @return
	 */
	public static PaymentPlatformVO parseToVO(PaymentPlatform entity) {
		//创建 VO 对象
		PaymentPlatformVO vo = new PaymentPlatformVO();
		//将 Entity 中属性提取，设定到 VO 中
		//借助于spring所提供的 Bean Utils 来拷贝属性
		BeanUtils.copyProperties(entity,vo);

		return vo;
	}
}
