// IndexController.java의 코드 //

package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello, Spring Boot!";
    }
}

