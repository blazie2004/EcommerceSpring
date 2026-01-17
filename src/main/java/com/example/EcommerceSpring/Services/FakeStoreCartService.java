package com.example.EcommerceSpring.Services;

import com.example.EcommerceSpring.Dto.CartDto;
import com.example.EcommerceSpring.Gateway.ICartGateway;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreCartService implements ICartService{


     private final ICartGateway _cartgateway;

    FakeStoreCartService(ICartGateway _cartgateway){
        this._cartgateway=_cartgateway;
    }
    @Override
    public List<CartDto> getCart() {
        return _cartgateway.getCart();
    }
}



