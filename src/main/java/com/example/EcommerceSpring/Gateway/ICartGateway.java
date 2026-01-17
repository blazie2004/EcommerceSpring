package com.example.EcommerceSpring.Gateway;

import com.example.EcommerceSpring.Dto.CartDto;

import  java.util.*;

public interface ICartGateway {
    public List<CartDto>getCart();
}
