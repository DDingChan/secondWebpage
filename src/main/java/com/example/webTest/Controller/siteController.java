package com.example.webTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteController {
    @GetMapping("/HTML")
    public String HTML(){
        return "site/HTML";
    }

    @GetMapping("/CSS")
    public String CSS(){
        return "site/CSS";
    }

    @GetMapping("/Java")
    public String Java(){
        return "site/Java";
    }

}
