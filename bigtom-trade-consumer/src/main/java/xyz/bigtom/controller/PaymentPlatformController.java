package xyz.bigtom.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.bigtom.base.controller.BaseController;
import xyz.bigtom.base.pojo.vo.PageVO;
import xyz.bigtom.base.pojo.vo.ResponseVO;
import xyz.bigtom.pojo.trade.vo.PaymentPlatformVO;
import xyz.bigtom.transport.trade.PaymentPlatformTransport;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-支付管理- 支付平台控制器</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Api(value = "汤姆旅游租赁平台-支付管理- 支付平台控制器", tags = {"汤姆旅游租赁平台-支付管理- 支付平台控制器"})
@RestController("paymentPlatformController")
@RequestMapping("/trade/paymentplatform")
public class PaymentPlatformController extends BaseController {
	@Autowired
	private PaymentPlatformTransport transport;

	@ApiOperation(value = "根据分页信息查新列表",httpMethod = "POST")
	@ApiImplicitParams({
			@ApiImplicitParam(value = "当前页码",dataType = "Integer",required = false),
			@ApiImplicitParam(value = "每页显示数量",dataType = "Integer",required = false)
	})
	@ApiResponse(code = 200,message = "响应成功")
	@PostMapping("/page")
	public ResponseVO queryListByPage(Integer pageNum,Integer pageSize) throws Exception{
		//根据 pageNum 和 pageSize 创建 Page对象
		PageVO<PaymentPlatformVO> pageVO = new PageVO<PaymentPlatformVO>(pageNum,pageSize);
		//使用传输层调用 Provide 进行查询
		pageVO = transport.getByPage(pageVO);
		//返回结果
		return ResponseVO.success(pageVO);
	}

	@ApiOperation(value = "根据查询对象查询列表", httpMethod = "POST")
	@ApiImplicitParam(value = "查询视图", dataType = "PaymentPlatformVO", dataTypeClass =PaymentPlatformVO.class, required = true)
	@ApiResponse(code = 200, message = "响应成功")
	@PostMapping("/list")
	public ResponseVO queryListByQuery(PaymentPlatformVO queryVO) throws Exception {
		// 使用 Transport 层进行列表查询
		List<PaymentPlatformVO> list = transport.getListByQuery(queryVO);
		return ResponseVO.success(list);
	}

	@ApiOperation(value = "根据主键查询对象", httpMethod = "GET")
	@ApiResponse(code = 200, message = "响应成功")
	@PostMapping("/id/{id}")
	public ResponseVO queryById(@PathVariable("id") String id) throws Exception {
		// 使用 Transport 层进行列表查询
		PaymentPlatformVO paymentPlatformVO = transport.getById(id);
		return ResponseVO.success(paymentPlatformVO);
	}

	@ApiOperation(value = "保存信息", httpMethod = "POST")
	@ApiImplicitParam(value = "保存视图", dataType = "PaymentPlatformVO", dataTypeClass =PaymentPlatformVO.class, required = true)
	@ApiResponse(code = 200, message = "响应成功")
	@PostMapping("/save")
	public ResponseVO save(@RequestBody PaymentPlatformVO vo) throws Exception {
		// 判断此时用户所填写的名称不能为空
		if (vo.getPlatform() != null && !"".equals(vo.getPlatform().trim())) {
			// 校验名字是否唯一
			PaymentPlatformVO queryVO = new PaymentPlatformVO();
			queryVO.setPlatform(vo.getPlatform());
			List<PaymentPlatformVO> list = transport.getListByQuery(queryVO);
			if (list == null || list.isEmpty()) {
				// 此时的名字可用，保存信息
				boolean flag = transport.save(vo);
				if (flag) {
					return ResponseVO.success();
				} else {
					return ResponseVO.failure("添加失败");
				}
			} else {
				return  ResponseVO.failure("该支付平台已经添加");
			}
		} else {
			return ResponseVO.failure("请填写有效的支付平台名称");
		}
	}

	@ApiOperation(value = "修改信息", httpMethod = "POST")
	@ApiImplicitParam(value = "修改视图", dataType = "PaymentPlatformVO", dataTypeClass =PaymentPlatformVO.class, required = true)
	@ApiResponse(code = 200, message = "响应成功")
	@PostMapping("/update")
	public ResponseVO update(@RequestBody PaymentPlatformVO vo) throws Exception {
		boolean flag = transport.update(vo);
		if (flag) {
			return ResponseVO.success();
		} else {
			return ResponseVO.failure("添加失败");
		}
	}
}
