package com.gmm.item.example.ms.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName：SwaggerConfig
 * @description: Swagger配置类
 * @author: gmm
 * @create: 2019-10-24
 * @version：1.0
 **/
@Configuration  //让Spring来加载该类配置
@EnableSwagger2 //启用Swagger2
public class SwaggerConfig {
    /**
     * 创建一个对象;用来展示文档信息;
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gmm.item.example.ms.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建api的基本信息;
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户管理APP文档")   //接口的标题;
                .description("API文档主要包含用户管理的RESTFUL API  请求")//接口
                .termsOfServiceUrl("http://gmmsystem.com/")//接口的路径;
                .contact(new Contact("gmm",null,null))//接口的作者;
                .version("2.0")//版本
                .build();
    }
}
