package com.example.opsnshift.hellworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HellWordController {

    @GetMapping(value = "/hell/{value}")
    public String getHellWorld(@PathVariable("value") String value) {
        return "hell world sása -> " + value;


    }
}
