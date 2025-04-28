package com.example.note.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {


    @RequestMapping("/")
    public String index(HttpSession session){
        //简单的登录验证
        if (session.getAttribute("LOGIN_USER")==null){
            return "login";
        }
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam("user_name") String userName, @RequestParam("user_passWord") String userPassword, Model model) {
        // 这里添加你的登录验证逻辑
        if (true) {
            session.setAttribute("LOGIN_USER", userName);
            return "redirect:/"; // 重定向到首页
        } else {
            model.addAttribute("error", "用户名或密码错误");
            return "login"; // 返回登录页并显示错误
        }
    }
}
