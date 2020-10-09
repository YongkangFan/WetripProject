package xyz.bigtom.trade.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.netty.util.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;
import xyz.bigtom.base.pojo.vo.PageVO;
import xyz.bigtom.pojo.trade.entity.PaymentPlatform;
import xyz.bigtom.pojo.trade.vo.PaymentPlatformVO;
import xyz.bigtom.trade.dao.PaymentPlatformDao;
import xyz.bigtom.trade.service.PaymentPlatformService;
import xyz.bigtom.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理-支付平台业务层实现类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("paymentPlatformService")
@Transactional
public class PaymentPlatformServiceImpl implements PaymentPlatformService {
	@Autowired
	private PaymentPlatformDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据分页对象查询分页信息</b>
	 * @param pageVO
	 * @return
	 */
	@Override
	public PageVO<PaymentPlatformVO> getByPage(PageVO<PaymentPlatformVO> pageVO) throws Exception {
		//创建查询对象
		PaymentPlatform query = new PaymentPlatform();
		//开启 PageHelper 分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//进行分页查询
		List<PaymentPlatform> list = dao.findListByQuery(query);
		//创建pageInfo对象
		PageInfo pageInfo = new PageInfo(list);
		//提取数据
		List<PaymentPlatformVO> resultList = new ArrayList<PaymentPlatformVO>();
		for(PaymentPlatform entity : (List<PaymentPlatform>)pageInfo.getList()){
			resultList.add(PaymentPlatform.parseToVO(entity));
		}
		pageVO.setList(resultList);
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
		return  pageVO;
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	public List<PaymentPlatformVO> getListByQuery(PaymentPlatformVO queryVO) throws Exception {
		// 将查询视图转换为查询实体
		PaymentPlatform query = PaymentPlatformVO.parseToEntity(queryVO);
		// 进行列表查询
		List<PaymentPlatform> list = dao.findListByQuery(query);
		// 将实体列表切换为视图列表
		List<PaymentPlatformVO> resultVO = new ArrayList<PaymentPlatformVO>();
		if (list != null) {
			for (PaymentPlatform entity : list) {
				resultVO.add(PaymentPlatform.parseToVO(entity));
			}
		}

		return resultVO;
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public PaymentPlatformVO getById(String id) throws Exception {
		// 创建查询实体
		PaymentPlatform query = new PaymentPlatform();
		query.setId(id);
		// 进行列表查询
		List<PaymentPlatform> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			PaymentPlatform entity = list.get(0);
			return PaymentPlatform.parseToVO(entity);
		}
		return null;
	}

	/**
	 * <b>保存信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(PaymentPlatformVO vo) throws Exception {
		// 将 vo 转换为 entity
		PaymentPlatform entity = PaymentPlatformVO.parseToEntity(vo);
		// 设定主键
		entity.setId(idGenerator.createId());
		// 保存
		Integer count = dao.save(entity);

		if (count != null && count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>修改信息</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(PaymentPlatformVO vo) throws Exception {
		// 将 vo 转换为 entity
		PaymentPlatform entity = PaymentPlatformVO.parseToEntity(vo);
		// 保存
		Integer count = dao.update(entity);

		if (count != null && count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>按照平台名称查询平台信息</b>
	 * @param platform
	 * @return
	 * @throws Exception
	 */
	@Override
	public PaymentPlatform getByPaymentPlatform(String platform) throws Exception {
		// 创建查询实体
		PaymentPlatform query = new PaymentPlatform();
		query.setPlatform(platform);
		// 进行列表查询
		List<PaymentPlatform> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
