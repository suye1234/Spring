package org.suye.spring4.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suye.spring4.mvc.dto.PersonDto;

/**
 * Created by suye on 2017/1/4.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public PersonDto getJson(PersonDto person){

        return new PersonDto(person.getId() + 1L, person.getName() + "yy");
    }

    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public PersonDto getXml(PersonDto person){

        return new PersonDto(person.getId() + 1L, person.getName() + "yy");
    }
}
