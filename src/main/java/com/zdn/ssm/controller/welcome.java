package com.zdn.ssm.controller;

import com.zdn.ssm.entity.User;
import com.zdn.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class welcome {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String name, String password) {
        User user = userService.findNameAndPass(name, password);
        if (user == null) {
            return "/success";
        } else {
            return "/welcome";
        }
    }
}
