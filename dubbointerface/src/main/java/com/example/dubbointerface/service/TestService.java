package com.example.dubbointerface.service;

import com.example.dubbointerface.dto.UserDto;

/**
 * @Author wll
 * @Date 2019/10/16 13:32
 * @Description
 **/
public interface TestService {
    /**
     * say
     *
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * 根据 用户ID 获取用户信息
     * @param userId
     * @return
     */
    UserDto getUserById(Integer userId);
}
