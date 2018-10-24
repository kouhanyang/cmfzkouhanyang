package com.baizhi.test;

import com.baizhi.Service.MenuService;
import com.baizhi.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public class MenuTest extends Test{
    @Autowired
    private MenuService menuService;
    @org.junit.Test
    public  void select(){
       List<Menu> list=menuService.selectMenu();
        System.out.println(list);

    }

}
