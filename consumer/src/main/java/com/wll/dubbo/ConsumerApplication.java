package com.wll.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
/**
 * @Author wll
 * @Date 2019/10/16 13:32
 * @Description
 **/

@CrossOrigin//允许跨越访问
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
