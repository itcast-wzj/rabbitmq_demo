package com.wzj.service.impl;

import com.wzj.entity.User;
import com.wzj.mapper.UserMapper;
import com.wzj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String businessLogic1() {
        User user = userMapper.selectByPrimaryKey(1);
        return "businessLogic1";
    }

    @Override
    public String businessLogic2() {
        return "businessLogic2";
    }
}
