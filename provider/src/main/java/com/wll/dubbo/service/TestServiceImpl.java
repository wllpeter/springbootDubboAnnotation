package com.wll.dubbo.service;

import com.example.dubbointerface.service.TestService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
/**
 * @Author wll
 * @Date 2019/10/16 13:32
 * @Description
 **/
@Service(interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
