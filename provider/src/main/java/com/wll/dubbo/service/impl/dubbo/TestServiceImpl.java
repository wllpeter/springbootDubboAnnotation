package com.wll.dubbo.service.impl.dubbo;

import com.example.dubbointerface.dto.UserDto;
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
        return "Hello " + name;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        UserDto userDto = new UserDto();
        userDto.setUserId(userId);
        userDto.setAge(22);
        String name = "";
        String school = "";
        if (userId == 1) {
            name = "张三";
            school = "清华大学";
        } else if (userId == 2) {
			name = "李四";
			school = "北京大学";
        } else if (userId == 3) {
			name = "王五";
			school = "上海交通大学";
        }
        userDto.setName(name);
        userDto.setSchool(school);
        return userDto;
    }

}
