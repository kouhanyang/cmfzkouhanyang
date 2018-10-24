package com.baizhi.Controller;

import com.baizhi.Service.MenuService;
import com.baizhi.entity.Menu;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/23.
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/select")
    public List<Menu>  selectMenu(){
        List<Menu> list=menuService.selectMenu();
        return list;
    }
}
