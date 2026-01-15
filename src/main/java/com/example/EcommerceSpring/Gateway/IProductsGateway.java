package com.example.EcommerceSpring.Gateway;

import com.example.EcommerceSpring.Dto.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IProductsGateway {
    public List<ProductDto> getAllProducts();

}
