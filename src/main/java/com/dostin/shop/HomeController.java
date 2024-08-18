package com.dostin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/shop")
    @ResponseBody

    public String showHome() {
        return "첫 시작";
    }
}
