package com.example.testSpringShop.controller;

import com.example.testSpringShop.database.Repository.UserRepository;
import com.example.testSpringShop.database.User;
import com.example.testSpringShop.model.request.TestRequest;
import com.example.testSpringShop.model.request.UserRequest;
import com.example.testSpringShop.model.response.TestResponse;
import com.example.testSpringShop.model.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
public class TestApi {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public String getUser(){
        return userRepository.findAll().stream().toList().toString();
    }

    @PostMapping("/user")
    public String insertUser(@RequestBody User request){
        return userRepository.save(request).toString();
    }

    @GetMapping
    public TestResponse hello() {
        TestResponse testResponse = new TestResponse();
        testResponse.setName("Shopper");
        testResponse.setLastName("Chitsaad");


        return testResponse;
    }

    @PostMapping
    @RequestMapping("/post")
    public TestResponse testPost(@RequestBody TestRequest request){
        TestResponse testResponse = new TestResponse();
        testResponse.setName(request.getFirstName());
        testResponse.setLastName(request.getLastName());
        return testResponse;
    }


    @GetMapping
    @RequestMapping("/testget")
    public TestResponse testGet() {
        return hello();
    }

}
