package com.example.testSpringShop.api;

import com.example.testSpringShop.model.request.TestRequest;
import com.example.testSpringShop.model.response.TestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApi {

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
