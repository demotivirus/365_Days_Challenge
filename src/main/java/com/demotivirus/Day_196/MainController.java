package com.demotivirus.Day_196;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainController {

    //@ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello from test controller";
    }
}
