package com.example.cybear.prueba.chinchin.products.controllers;

import com.example.cybear.prueba.chinchin.products.Exceptions.CustomException;
import com.example.cybear.prueba.chinchin.products.Services.IProductService;
import com.example.cybear.prueba.chinchin.products.models.request.TransformRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        } catch (CustomException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("product-transform")
    public ResponseEntity<?> transformProducts(@RequestBody TransformRQ request) {
        try {
            return new ResponseEntity<>(productService.getEquivalentPrice(request), HttpStatus.OK);
        } catch (CustomException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
