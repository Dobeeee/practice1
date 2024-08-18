package com.dostin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/date")
    @ResponseBody
    Date date () {
        Date now = new Date();
        System.out.println(now);
        return now;
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "about 페이지";
    }

}
