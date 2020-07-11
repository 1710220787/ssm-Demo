package com.yxun8.controller;

import com.yxun8.domain.User;
import com.yxun8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public List<User> test(){
        List<User> userList = userService.allUser();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }
}
