package com.jathu.firstproject.Controller;


import com.jathu.firstproject.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/test")
public class TestController {

   @Autowired
    private TestService t1;

@GetMapping(path = "/message")
    private String message(){
        return t1.getmessage();
    }
}
