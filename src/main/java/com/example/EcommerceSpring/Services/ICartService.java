package com.example.EcommerceSpring.Services;

import com.example.EcommerceSpring.Dto.CartDto;

import java.util.List;

public interface ICartService {

    public List<CartDto> getCart();
}
