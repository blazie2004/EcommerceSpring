package com.example.EcommerceSpring.Controllers;


import com.example.EcommerceSpring.Dto.ProductDto;
import com.example.EcommerceSpring.Services.IProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

@RequestMapping("/api/products")
public class ProductsController {

    private final IProductsService _categoryService;


    public ProductsController(IProductsService categoryService){
        this._categoryService=categoryService;
    }

//    @GetMapping
//    public String getCategory(){
//        return "electronics";
//    }
//    @GetMapping("/count")
//    public int getCount(){
//        return 5;
//
    @GetMapping()

    public List<ProductDto> getAllProducts(){
        return _categoryService.getAllProducts();
    }





}
