package com.example.EcommerceSpring.configuration;

import com.example.EcommerceSpring.api.FakeStoreProductApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Configuration
public class RetroFitConfig {
    @Bean
    public FakeStoreProductApi fakeStoreApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(FakeStoreProductApi .class);
    }
}
