package com.example.testSpringShop.controller;

import com.example.testSpringShop.database.Repository.UserRepository;
import com.example.testSpringShop.database.User;
import com.example.testSpringShop.model.request.UserRequest;
import com.example.testSpringShop.model.response.ClosetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Api {


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


//    @PostMapping("/login")
//    public
//    @GetMapping("/user")
//    public UserResponse getUser(){
//        //get user response
//        UserResponse userResponse = new UserResponse();
//
//
//        userResponse.setId("1");
//        userResponse.setName("Shop");
//        userResponse.setLastName("Shopper");
//
//
//
//        return userResponse;
//    }


//    @GetMapping("/user")
//    public UserResponse getUser(@RequestParam String username){
//        //get user response
//        UserResponse userResponse = new UserResponse();
//
//        if (username.equals("nattawut.c")){
//            userResponse.setId("1");
//            userResponse.setName("Shop");
//            userResponse.setLastName("Shopper");
//            userResponse.setUsername("nattawut.c");
//            userResponse.setPassword("1234");
//            userResponse.setImage("");
//        }else{
//            userResponse.setId("2");
//            userResponse.setName("test");
//            userResponse.setLastName("test");
//            userResponse.setUsername("test");
//            userResponse.setPassword("test");
//        }
//
//        return userResponse;
//    }

    @PostMapping("/user/add")
    public void addUser(@RequestBody UserRequest userRequest){



    }

    @GetMapping("/closet/user")
    public ArrayList<ClosetResponse> getUserCloset(@RequestParam String username){
        ArrayList<ClosetResponse> closetResponseList = new ArrayList<>();

        ClosetResponse closetResponse = new ClosetResponse();
        closetResponse.setCategory("shirt");
        closetResponse.setImage("https://s3-alpha-sig.figma.com/img/9f9c/df73/bf04264827b9723d5bbc85b8f6a9a235?Expires=1719792000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q6alfxx1o-D3Na8m~q0ADtBxB8cRsuNQe0AWdFAZNFtrIByfNx~fyYiyeDWGjJtZ48P5G0KEHckX1Xm8615lxIUqZaFQ1okFSKZh6M0yS43UqEhIWkeirrMxgDG9aaATfbDntxgpmNL5ZZddhZ6MdGNCXev4CPkWCVqKMuSsbeu5qfa7ZZRRShcJQa2rfa2aIRUTPV4i~xa8djmsWolZybRtt5wW0Wne-l-HcwiRnqJJvhxHuv8OQyQVG9OqwHJTu--xo61DuLtqZUXigZTldZhUCAhGwjdCcCe5NyUfnKY4c7kKar4TRaA7X9f~gPo6U7bQujWJem-VsemdZb-Y-Q__");
        closetResponse.setTitle("black shirt");
        closetResponse.setSelected(false);

        ClosetResponse closetResponse2 = new ClosetResponse();
        closetResponse2.setCategory("shirt");
        closetResponse2.setImage("https://s3-alpha-sig.figma.com/img/9f9c/df73/bf04264827b9723d5bbc85b8f6a9a235?Expires=1719792000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=Q6alfxx1o-D3Na8m~q0ADtBxB8cRsuNQe0AWdFAZNFtrIByfNx~fyYiyeDWGjJtZ48P5G0KEHckX1Xm8615lxIUqZaFQ1okFSKZh6M0yS43UqEhIWkeirrMxgDG9aaATfbDntxgpmNL5ZZddhZ6MdGNCXev4CPkWCVqKMuSsbeu5qfa7ZZRRShcJQa2rfa2aIRUTPV4i~xa8djmsWolZybRtt5wW0Wne-l-HcwiRnqJJvhxHuv8OQyQVG9OqwHJTu--xo61DuLtqZUXigZTldZhUCAhGwjdCcCe5NyUfnKY4c7kKar4TRaA7X9f~gPo6U7bQujWJem-VsemdZb-Y-Q__");
        closetResponse2.setTitle("black shirt");
        closetResponse2.setSelected(false);


        ClosetResponse closetResponse3 = new ClosetResponse();
        closetResponse3.setCategory("trousers");
        closetResponse3.setTitle("pink pants");
        closetResponse3.setSelected(false);
        closetResponse3.setImage("https://s3-alpha-sig.figma.com/img/9605/4901/9c4bc9855881cd15b453b4d1f966e6ba?Expires=1719792000&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=nPkloCYb1l25LBgG1Gj0YsJegRMT6aDSw8EMMt6Kc32ScbAjS-FxVPYpUu60CsBP11ByY3b6OIOrh9aNlvcqQM5sP8iSCRfDV9V2eTsHQjiW1LDqAxcAa4eMTWhTOMJa8vujDKwl0WTXFb8~T8YuEs6UJ2OGrVvXnweARweYpySxaZJOK3GPScGIUCvG-1Bc5KDC50KQP7og2KgVtYj7otWEtP145-ZdmQC0ZibnrnsfBbiOigmmA8h6Yl~vyBFFUIWO2yUsnR5-eVxT4NleKFd0dDH36pFc3se46y-j-ptG3bZi5SHFve3IdD~qAmL8uyBhyePVqtb91a-drZrTVg__");


        closetResponseList.add(closetResponse);
        closetResponseList.add(closetResponse2);
        closetResponseList.add(closetResponse3);

        return closetResponseList;

    }



}
