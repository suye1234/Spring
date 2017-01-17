package org.suye.spring3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.suye.spring3.service.HelloService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by suye on 2017/1/17.
 */
@Controller
@RequestMapping("/groovy")
public class GroovyController {
    @Resource
    public HelloService helloService;

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){

        return helloService.doHello();
    }

}
