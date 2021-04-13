package com.hxd.learn.mysql.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Hikari数据源 PostProcessor
 *
 * @author huangxiaodong
 * @date 2021/3/31  17:10
 */
@Slf4j
@Component
public class HikariDbSourcePostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (HikariDataSource.class.getName().equals(bean.getClass().getName())) {
            HikariDataSource dataSource = (HikariDataSource) bean;
        }
        return bean;
    }
}
