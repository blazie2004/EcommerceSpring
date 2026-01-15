package com.example.EcommerceSpring.Gateway;

import com.example.EcommerceSpring.Dto.FakeStoreProductsResponseDto;
import com.example.EcommerceSpring.Dto.ProductDto;
import com.example.EcommerceSpring.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FakeProductGateway implements IProductsGateway {

    private final FakeStoreProductApi api;

    public FakeProductGateway(FakeStoreProductApi api) {
        this.api = api;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        try {
            List<FakeStoreProductsResponseDto> response =
                    api.getAllProducts().execute().body();

            return response.stream()
                    .map(p -> new ProductDto((String) p.getTitle()))
                    .toList();


        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch products", e);
        }
    }
}
