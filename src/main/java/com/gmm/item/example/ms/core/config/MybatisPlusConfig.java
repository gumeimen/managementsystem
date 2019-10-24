package com.gmm.item.example.ms.core.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName：MybatisPlusConfig
 * @description: mybatis-plus的配置文件
 * @author: gmm
 * @create: 2019-10-23
 * @version：1.0
 **/

@Configuration
public class MybatisPlusConfig {


   /** 
   * @Description: 分页的插件设置；
   * @Param: [] 
   * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor 
   * @Author: gmm
   * @Date: 2019-10-24 
   */ 
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        //设置数据库方言类型
        page.setDialectType("mysql");
        return page;
    }
}
