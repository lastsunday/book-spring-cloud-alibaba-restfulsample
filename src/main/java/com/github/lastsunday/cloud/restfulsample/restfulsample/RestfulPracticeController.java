package com.github.lastsunday.cloud.restfulsample.restfulsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulPracticeController {

    @GetMapping(value="/testRestfulApi")
    public String testRestfulApi(){
        return "test";
    }
}
