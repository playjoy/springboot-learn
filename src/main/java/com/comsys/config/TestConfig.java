package com.comsys.config;

import java.nio.charset.Charset;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.comsys.service.UserService;
import com.jolbox.bonecp.BoneCPDataSource;



/**
 * 启动配置
 * @author wyd
 *
 */
@Configuration    //通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan(basePackages = "com.comsys") //配置扫描包
@PropertySource(value = { "classpath:jdbc.properties" }, ignoreResourceNotFound = true) //加载配置文件
@EnableAsync
//@EnableAspectJAutoProxy   //开启aop
//@EnableScheduling         //开启计划任务
@SpringBootApplication(exclude = { RedisAutoConfiguration.class })//开启自动配置
public class TestConfig extends SpringBootServletInitializer{
	


	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(TestConfig.class);
	    }
	
	@Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }
	
	public static void main(String[] args) {
		/* // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        
        // 在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);
        
        // 调用对象中的方法
        List list = userService.getUserList();
        for (Object user : list) {
            System.out.println(user);
        }*/
		
		SpringApplication application = new SpringApplication(TestConfig.class);
       application.setBannerMode(Mode.OFF);
       application.run(args);
        
        // 销毁该容器
        //context.destroy();
	}

}
