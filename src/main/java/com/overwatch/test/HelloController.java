package com.overwatch.test;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Transactional
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/hi")
    public String hi() {
        return "hello";
    }


    @GetMapping("/about")
    public String about() {
        return "about";
    }


    @GetMapping("/mens")
    public String mens() {
        return "mens";
    }

    @GetMapping("/womens")
    public String womens() {
        return "womens";
    }


    @GetMapping("/icons")
    public String icons() {
        return "icons";
    }

    @GetMapping("/typography")
    public String typography() {
        return "typography";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }


    @GetMapping("/single")
    public String single() {
        return "single";
    }


}
