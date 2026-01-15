package com.example.EcommerceSpring.api;

import com.example.EcommerceSpring.Dto.FakeStoreProductsResponseDto;
import org.springframework.stereotype.Component;
import retrofit2.http.GET;

import retrofit2.Call;

import java.util.List;
@Component
public interface FakeStoreProductApi {
    @GET("/products")
    Call<List<FakeStoreProductsResponseDto>> getAllProducts();



}
