package com.lfy.management.controller;

import com.lfy.management.pojo.SystemUser;
import com.lfy.management.service.LoginAndQuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller

public class LoginAndQuitController {

    @Autowired
    private LoginAndQuitService loginAndQuitService;

    @RequestMapping("/login.do")
    public String login(String name, String password, Model model, HttpSession session) {
        try {
            SystemUser user = loginAndQuitService.login(name, password);
            session.setAttribute("systemuser", user);
            model.addAttribute("systemuser", user);
            return "managementcenter";
        } catch (Exception e) {
            model.addAttribute("errinfo",e.getMessage());
            System.out.println(e.getMessage());
//            e.printStackTrace();
            return "index";
        }
    }

    @RequestMapping("/quit.do")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }

}
