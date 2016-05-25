package com.airkisser.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jun on 2016/5/25.
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping
    public String hello() {
        System.out.println(0 / 0);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/json")
    public String json() {
        return "hello";
    }
}
