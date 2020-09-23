package cn.ekgc.leyouyuan.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>乐游原-基础控制器</b>
 * <p>
 *     基础控制器依赖注入<b>HttpServletRequest</b>,<b>HttpServletResponse</b>和<b>HttpSession</b>.<br/>
 *     其他功能模块控制器必须继承于基础控制器
 * </p>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
