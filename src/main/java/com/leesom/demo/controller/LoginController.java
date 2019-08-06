package com.leesom.demo.controller;

import com.leesom.demo.entity.User;
import com.leesom.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转首页 登录页
    @RequestMapping("toIndex")
    public String show(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/loginUser")
    public String login(User user, HttpServletRequest request){

        String name = user.getUserName();
        String pwd = user.getPassWord();
        User u1 = userService.login(name,pwd);
        if(u1 == null){
            return "用户不存在或密码错误";
        }else{
            request.getSession().setAttribute("session_user",user);
            return "登录成功";
        }
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user){

        int su = userService.register(user);
        if(su == 0){
            System.out.println("注册失败");
        }
        return "welcome";
    }

    @RequestMapping("/welcome")
    public String welcome(){

        return "welcome";
    }

    @RequestMapping("outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("session_user");
        response.sendRedirect("/user/toIndex");
    }
}
