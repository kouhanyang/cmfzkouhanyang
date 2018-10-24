package com.baizhi.Controller;

import com.baizhi.Service.AdminService;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
/**
 * Created by Administrator on 2018/10/23.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public String login(String vrifyCode,Admin admin, HttpSession session){
        String code= (String) session.getAttribute("vrifyCode");
        Admin adm=adminService.login(admin);
        if(adm!=null && code.equals(vrifyCode) ){
            return"redirect:/main/main.jsp";
        }
        return "login";
    }
}
