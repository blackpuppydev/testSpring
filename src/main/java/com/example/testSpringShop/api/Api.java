package com.example.testSpringShop.api;

import com.example.testSpringShop.model.request.UserRequest;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
import com.example.testSpringShop.model.response.UserResponse;


@RestController
@RequestMapping("/api")
public class Api {


    @GetMapping("/user")
    public UserResponse getUser(){
        //get user response

        return new UserResponse();
    }

    @PostMapping("/user/add")
    public void addUser(@RequestBody UserRequest userRequest){



    }



}
