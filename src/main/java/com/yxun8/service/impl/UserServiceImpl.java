package com.yxun8.service.impl;

import com.yxun8.domain.User;
import com.yxun8.mapper.UserMapper;
import com.yxun8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> allUser() {
        List<User> userList = userMapper.allUser();
        return userList;
    }
}
