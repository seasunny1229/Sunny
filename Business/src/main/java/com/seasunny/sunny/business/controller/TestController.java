package com.seasunny.sunny.business.controller;

import com.seasunny.sunny.business.dao.TestMapper;
import com.seasunny.sunny.business.model.Person;
import com.seasunny.sunny.common.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/hello")
    public String hello(){
        return TestUtils.hello();
    }

    @GetMapping("/hello/{id}")
    public Person getPersonById(@PathVariable("id") int id){
        return testMapper.getById(id);
    }

}
