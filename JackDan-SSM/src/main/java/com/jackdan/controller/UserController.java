package com.jackdan.controller;

import com.github.pagehelper.PageInfo;
import com.jackdan.domain.User;
import com.jackdan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by JackDan9 on 2018/1/1.
 */
@CrossOrigin(origins = "*") // 设置跨域权限, *表示允许所有跨域访问
@Controller
@RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getAllUser")
    public @ResponseBody
    PageInfo<User> getAllUser(@RequestBody Map<String, String> params) throws Exception {
        PageInfo<User> userPageInfo = userService.selectAllUser(params);
        return userPageInfo;
    }
}
