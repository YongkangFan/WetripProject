package cn.ekgc.leyouyuan.controller;

import cn.ekgc.leyouyuan.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private IdGenerator idGenerator;

	@GetMapping("/create")
	public String create() throws Exception{
		return idGenerator.createId();
	}
}
