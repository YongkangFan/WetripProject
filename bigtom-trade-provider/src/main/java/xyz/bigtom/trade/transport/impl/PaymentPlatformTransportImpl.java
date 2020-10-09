package xyz.bigtom.trade.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.bigtom.base.pojo.vo.PageVO;
import xyz.bigtom.pojo.trade.entity.PaymentPlatform;
import xyz.bigtom.pojo.trade.vo.PaymentPlatformVO;
import xyz.bigtom.trade.service.PaymentPlatformService;
import xyz.bigtom.transport.trade.PaymentPlatformTransport;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理-支付平台传输层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("paymentPlatformTransport")
@RequestMapping("/trade/paymentplatform/trans")
public class PaymentPlatformTransportImpl implements PaymentPlatformTransport {
	@Autowired
	private PaymentPlatformService service;
	/**
	 * <b>根据分页对象查询分页信息</b>
	 * @param pageVO
	 * @return
	 */
	@PostMapping("/page")
	@Override           //强制检查是不是重写
	public PageVO<PaymentPlatformVO> getByPage(@RequestBody PageVO<PaymentPlatformVO> pageVO) throws Exception{
		return service.getByPage(pageVO);
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	@Override
	public List<PaymentPlatformVO> getListByQuery(@RequestBody PaymentPlatformVO queryVO) throws Exception {
		return service.getListByQuery(queryVO);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	@Override
	public PaymentPlatformVO getById(@RequestParam String id) throws Exception {
		return service.getById(id);
	}

	/**
	 * <b>保存信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody PaymentPlatformVO vo) throws Exception {
		return service.save(vo);
	}

	/**
	 * <b>修改信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody PaymentPlatformVO vo) throws Exception {
		return service.update(vo);
	}

	/**
	 * <b>按照平台名称查询平台信息</b>
	 * @param platform
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/platform")
	@Override
	public PaymentPlatform getByPaymentPlatform(String platform) throws Exception {
		return service.getByPaymentPlatform(platform);
	}
}
