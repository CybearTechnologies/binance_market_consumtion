package com.example.cybear.prueba.chinchin.products.controllers;

import com.example.cybear.prueba.chinchin.products.Exceptions.NoProductsException;
import com.example.cybear.prueba.chinchin.products.Services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
    private IProductService productService;

    public ProductController(@Autowired IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public ResponseEntity<?> getProducts() {
        try {
            return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
        } catch (NoProductsException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
