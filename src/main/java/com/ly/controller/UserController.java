package com.ly.controller;

import com.ly.common.BaseBean;
import com.ly.pojo.User;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @RequestMapping("/login.do")
    public @ResponseBody
    BaseBean<User> login(User user) {
        BaseBean<User> bean = new BaseBean<User>();

        List<User> list = userService.login(user);

        bean.setCode((list != null && list.size() > 0) ? 1 : 0);
        bean.setData(list);
        bean.setMsg("登录成功");

        return bean;

    }

    // 注册
    @RequestMapping("/register.do")
    public void register(User user, HttpServletResponse response) throws IOException {

        int i = userService.register(user);
        response.getWriter().print(i);
    }


}
