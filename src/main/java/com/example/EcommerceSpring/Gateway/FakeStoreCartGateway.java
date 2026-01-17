package com.example.EcommerceSpring.Gateway;

import com.example.EcommerceSpring.Dto.CartDto;
import com.example.EcommerceSpring.Dto.FakeStoreCartResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Component


public class FakeStoreCartGateway implements  ICartGateway {



    private final RestTemplate restTemplate = new RestTemplate();



    @Override
    public List<CartDto> getCart() {
        String url = "https://fakestoreapi.com/carts";

        FakeStoreCartResponseDto[] response =
                restTemplate.getForObject(url, FakeStoreCartResponseDto[].class);

        return Arrays.stream(response)
                .flatMap(cart -> cart.getProducts().stream())
                .map(p -> new CartDto(p.getProductId(), p.getQuantity()))
                .toList();
    }
}
