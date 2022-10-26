package com.example.automationProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDummyController {

    @Autowired
    RestDummyService restDummyService;

    @GetMapping("/mohit")
    public void getHello(){
       restDummyService.getHello();
    }
}
