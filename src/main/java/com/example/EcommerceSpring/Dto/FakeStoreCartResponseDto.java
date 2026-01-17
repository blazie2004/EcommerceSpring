package com.example.EcommerceSpring.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter

public class FakeStoreCartResponseDto {
    private int id ;
    private int userId;
    private String date;
    private List<FakeStoreCartItemResponseDto> products;
    private int __v;



}

