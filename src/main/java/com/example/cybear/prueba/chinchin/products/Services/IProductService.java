package com.example.cybear.prueba.chinchin.products.Services;

import com.example.cybear.prueba.chinchin.products.models.Product;
import com.example.cybear.prueba.chinchin.products.models.request.Request;

import java.util.List;

public interface IProductService {
    List<Product> getProductList();

    List<Product> getEquivalentPrice(Request request);
}
