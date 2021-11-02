package cn.firecode.explore.springframework.service.impl;

import cn.firecode.explore.springframework.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/1
 */
@Service
public class BaseUserService1Impl implements IUserService {
    @Override
    public String getUserName() {
        return "User A";
    }
}
