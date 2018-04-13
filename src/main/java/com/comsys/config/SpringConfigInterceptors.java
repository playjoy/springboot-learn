package com.comsys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.comsys.interceptors.CustomInterceptors;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 拦截器注册
 * @author wyd
 *
 */
@Configuration
public class SpringConfigInterceptors extends WebMvcConfigurerAdapter {
    
    @Autowired
    private CustomInterceptors customInterceptors;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 判断用户是否登录的拦截器
        registry.addInterceptor(customInterceptors);
    }



}
