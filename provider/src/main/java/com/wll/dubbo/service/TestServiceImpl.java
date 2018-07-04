package com.wll.dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.TestService;

@Service(interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
