package com.example.EcommerceSpring.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CartDto {
    private int productId;
    private int quantity;
}
