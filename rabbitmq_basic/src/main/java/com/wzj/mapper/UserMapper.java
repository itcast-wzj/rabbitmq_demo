package com.wzj.mapper;

import com.wzj.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.select.SelectMapper;

public interface UserMapper extends Mapper<User>, SelectMapper<User> {
}