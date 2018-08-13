package com.cccsoft.springcloudserviceprovider.web;

import com.cccsoft.springcloudserviceprovider.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/{userId}")
    public String findUserByUserName(@PathVariable String userName){

        return "welcome cccsoft!";
    }
}
