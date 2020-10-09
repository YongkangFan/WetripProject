package xyz.bigtom.base.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import sun.misc.Request;

/**
 * <b>大汤姆旅游租赁平台-基础功能-Swagger 配置类</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Configuration     //表示这个类是一个配置类(类似于xml配置)
public class SwaggerConfiguration {

	/**
	 * <b>创建 Swagger 的核心对象 Docket</b>
	 * <p>
	 *    核心类Docket 将Docket交给Spring管理 Docket就是一个bean
	 * </p>
	 * @return
	 */
	@Bean
	public Docket createRestApi(){
		//借助Docket生成SWAGGER_2类型apiInfo文档
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				//设定Swagger所显示的信息
				.apiInfo(apiInfo())
				// 设定Swagger框架扫描注解的基础位置
				.select()
				.apis(RequestHandlerSelectors.basePackage("xyz.bigtom"))
				//将所有和Swagger有关的注解全部进行加载
				.paths(PathSelectors.any())
				.build()
				;
		return docket;
	}
	/**
	 * <b>创建Swagger 在生成文档时，所需要的一些相关信息对象</b>
	 * @return
	 */
	private ApiInfo apiInfo(){
		//创建联系人信息
		Contact contact = new Contact("李二狗","http://www.bigtom.xyz","2845781579@qq.com");
		//通过build()生成ApiInfoBuild()建造器向apiInfo传递信息
		ApiInfo apiInfo = new ApiInfoBuilder()
				//设定生成文档时所显示的标题
				.title("大汤姆旅游租赁平台-交互接口文档")
				//设定文档描述
				.description("Spring Cloud | Swagger 2")
				//设定联系人信息
				.contact(contact)
				//设定版本信息
				.version("1.0.0")
				.build();
		return apiInfo;
	}
}
