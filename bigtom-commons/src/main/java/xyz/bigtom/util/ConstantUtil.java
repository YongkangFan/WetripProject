package xyz.bigtom.util;

import xyz.bigtom.util.trade.AlipayConstantUtil;

import java.util.Properties;

/**
 * <b>汤姆旅游租赁平台-基础功能-系统常量工具类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConstantUtil {
	private static Properties props = new Properties();

	static{
		try {
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>订单超时时间 (分钟) </b>
	 */
	public static final Integer ORDER_EXPIPE_MINUTE = Integer.parseInt(props.getProperty("order.expire.minute"));
}
