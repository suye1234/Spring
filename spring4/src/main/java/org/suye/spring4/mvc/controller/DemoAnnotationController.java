package org.suye.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.suye.spring4.mvc.dto.PersonDto;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by suye on 2017/1/4.
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnotationController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){

        return "url:" + request.getRequestURL() + " can access , Chaned";
    }


    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access, str: " + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access, id: " + id;
    }


    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    public @ResponseBody String demoPathVar(PersonDto person, HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access, person: " + person;
    }


    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(PersonDto person, HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access";
    }






}
