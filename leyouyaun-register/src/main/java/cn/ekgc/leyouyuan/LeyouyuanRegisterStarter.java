package cn.ekgc.leyouyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>乐游原-注册中心启动器</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class LeyouyuanRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(LeyouyuanRegisterStarter.class,args);
	}
}
