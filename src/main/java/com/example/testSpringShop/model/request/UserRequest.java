package com.example.testSpringShop.model.request;

import lombok.Data;

@Data
public class UserRequest {
    public String id;
    public String name;
    public String lastName;
    public String username;
    public String password;
    public String email;
}
