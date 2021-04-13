package com.hxd.learn.mysql.config;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * MybatisPlus 配置类
 *
 * @author huangxiaodong
 * @date 2021/3/31  15:07
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.hxd.learn.mysql.bd.mapper")
public class MybatisPlusConfig {

    /**
     * 打印 sql
     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        // 格式化sql语句
//        Properties properties = new Properties();
//        properties.setProperty("format", "true");
//        performanceInterceptor.setProperties(properties);
//        return performanceInterceptor;
//    }
}
