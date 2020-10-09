package xyz.bigtom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b>汤姆旅游租赁平台-后台管理- Provider 启动器</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableSwagger2
@EnableEurekaClient
@MapperScan("xyz.bigtom.dao")
@SpringBootApplication
public class AdminProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(AdminProviderStarter.class,args);
	}
}
