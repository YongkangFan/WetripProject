package cn.ekgc.leyouyuan.util;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

/**
 * <b>基础架构-主键生成器</b>
 * <p>
 *     数据库所有数据不再使用主键自增长策略，而是通过本生成器生成主键进行插入
 * </p>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
//@component （把普通pojo实例化到spring容器中，相当于配置文件中的 <bean id="" class=""/>）
//泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
@Component("idGenerator")
public class IdGenerator {
	private static final String KEY_MD5 = "MD5";

	/**
	 * <b>生成主键</b>
	 * <p>
	 *     通过获得当前时间戳后，使用MD5对其进行加密,<br/>
	 *     该方法属于线程同步的,当多个线程统一调用该方法时需要排队调用,<br/>
	 *     在毫秒内不会生成两个一样的主键id
	 * </p>
	 * @return
	 * @throws Exception
	 */
	public synchronized String createId() throws Exception{
		//获得当前时间毫秒数
		Long currentTimeMillis = System.currentTimeMillis();
		//对当前时间毫秒数使用 MD5 进行加密

		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			//使用 String.valueOf()将Long类型的时间转换为String类型,然后通过 MD5 加密
			byte[] inputData = String.valueOf(currentTimeMillis).getBytes("UTF-8");
			byte[] encryptionData = md.digest(inputData);
			for (int i = 0; i < encryptionData.length; i++) {
				int value = ((int) encryptionData[i]) & 0xff;
				if (value < 16) {
					sb.append("0");
				}
				sb.append(Integer.toHexString(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
		//将String字符串变成大写
		//return sb.toString().toUpperCase();
	}
}
