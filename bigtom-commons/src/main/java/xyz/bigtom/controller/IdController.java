package xyz.bigtom.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bigtom.util.IdGenerator;

/**
 * <b>汤姆旅游租赁平台-基础功能-id生成器接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Api(tags = {"汤姆旅游租赁平台-基础功能-id生成器接口"})
@RestController("idController")
@RequestMapping("/id")
public class IdController {
	@Autowired
	private IdGenerator idGenerator;

	@ApiOperation(value = "生成数据库主键",response = String.class,httpMethod = "GET")
	@ApiResponse(code = 200,message = "生成主键字符串")
	@GetMapping("/create")
	public String create() throws Exception{
		return idGenerator.createId();
	}
}
