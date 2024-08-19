package com.dostin.shop;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.jfr.Percentage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    @RequestMapping("/shop")
    @ResponseBody
    public String showHome() {
        return "라이브";
    }

    @GetMapping("/plus")
    @ResponseBody
    public void showPlus(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));

        resp.getWriter().append(a + b  + "");
    }

    @GetMapping("/gugudan")
    @ResponseBody
    public String showGugudan(Integer dan, Integer limit) {
        if (dan == null) {
            dan = 9;
        }
        if (limit == null) {
            limit = 9;
        }
        final Integer finalDan = dan;
        return IntStream.rangeClosed(1, limit)
                .mapToObj(i -> "%d * %d = %d".formatted(finalDan, i, finalDan * i))
                .collect(Collectors.joining("<br>"));


    }

}
