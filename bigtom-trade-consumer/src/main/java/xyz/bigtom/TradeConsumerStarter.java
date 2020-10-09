package xyz.bigtom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b>汤姆旅游租赁平台-支付管理- Consumer 启动器</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableSwagger2                 //给前端看接口文档
@EnableEurekaClient             //作为EurekaClient端
@EnableFeignClients             //通过Feign调用provider
@SpringBootApplication          //启动springboot框架
public class TradeConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(TradeConsumerStarter.class,args);
	}
}
