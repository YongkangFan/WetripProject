package xyz.bigtom.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <b>大汤姆旅游租赁平台-基础架构-订单编号生成器</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Component("orderNoGenerator")
public class OrderNoGenerator {

	/**
	 * <b>生成订单编号</b>
	 * <p>
	 *     订单编号生成规则：
	 *     1,获取当前时间
	 *     2,将当前时间格式转化为：yyyyMMddHHmmssSSSSSS；<br/>
	 *       最终获得20位订单编号
	 * </p>
	 * @return
	 * @throws Exception
	 */
	public synchronized String nextNo() throws Exception {
		//创建SimpleDateFormat对象,并且设定时间格式化为：yyyyMMddHHmmssSSSSSS
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSSSS");
		//将当前时间进行格式化
		return dateFormat.format(new Date());
	}
}
