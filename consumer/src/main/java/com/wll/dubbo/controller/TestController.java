package com.wll.dubbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.TestService;

@Controller
public class TestController {
	//public static final String masterUrl = "dubbo://127.0.0.1:20880";
	
	@Reference//(url = masterUrl)
	TestService testService;

	@RequestMapping(value="/master",method=RequestMethod.GET)
	@ResponseBody
    public String test(){
		String result = testService.sayHello("wllpeter");
        return result;
    }
}
