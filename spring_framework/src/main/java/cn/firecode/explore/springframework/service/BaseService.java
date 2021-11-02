package cn.firecode.explore.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/1
 */
@Service
public class BaseService {
    private static final String name = "YANGFAN";

    @Autowired
    @Qualifier(value = "baseUserService2Impl")
    private IUserService userService;

    public String getName(){
        return userService.getUserName();
    }
}
