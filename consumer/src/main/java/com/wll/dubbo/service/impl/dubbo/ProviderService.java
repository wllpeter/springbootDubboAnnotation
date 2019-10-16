package com.wll.dubbo.service.impl.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbointerface.dto.UserDto;
import com.example.dubbointerface.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @Author wll
 * @Date 2019/10/16 15:17
 * @Description
 **/
@Component
public class ProviderService {
    @Reference
    TestService testService;

    public String sayHello(String name) {
        return testService.sayHello(name);
    }

    public UserDto getUserById(Integer userId) {
        return testService.getUserById(userId);
    }
}
