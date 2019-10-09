package com.jindanupajit.javabootcamp.exercise4011;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")

    public String index() {
        return "index";
    }


    @RequestMapping(path = "/response", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String response() {
        return "<html><title>Test</title><body><h1>Test Page OK!</h1></body></html>";
    }
}
