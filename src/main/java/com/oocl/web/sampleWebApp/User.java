package com.oocl.web.sampleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User {
@RequestMapping("/user")
	
public  String greeting() {
	
    return "Hello World";
                    }
	
            }
