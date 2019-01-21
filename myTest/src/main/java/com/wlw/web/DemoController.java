package com.wlw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping(value = "getUserInfo")
    public void getUserInfo(){
        System.out.println("helloword");
    }

}
