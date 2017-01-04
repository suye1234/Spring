package org.suye.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by suye on 2017/1/4.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){

        return "index";
    }

}
