package com.example.EcommerceSpring.Services;

import com.example.EcommerceSpring.Dto.ProductDto;
import com.example.EcommerceSpring.Gateway.IProductsGateway;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeProductsService implements IProductsService {



    public IProductsGateway _productsgateway;

    public FakeProductsService(IProductsGateway _productsgateway){
        this._productsgateway=_productsgateway;
    }
   public List<ProductDto>getAllProducts(){
       return _productsgateway.getAllProducts();

   }
}
