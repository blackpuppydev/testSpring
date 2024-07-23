package com.example.testSpringShop.model.response;

import lombok.Data;

@Data
public class ClosetResponse {
    String image;
    String title;
    String category;
    Boolean selected;
}
