package com.example.EcommerceSpring.Controllers;


import com.example.EcommerceSpring.Dto.CartDto;
import com.example.EcommerceSpring.Services.ICartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Carts")
public class CartController {


    private final ICartService _cartservice;

    CartController(ICartService _cartservice){
        this._cartservice=_cartservice;
    }




    @GetMapping
    public List<CartDto>getCart(){
        return _cartservice.getCart();
    }
    


}
