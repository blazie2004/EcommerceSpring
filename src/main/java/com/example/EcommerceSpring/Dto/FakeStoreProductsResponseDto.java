package com.example.EcommerceSpring.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FakeStoreProductsResponseDto {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

//    public String getTitle() { return title; }


}
