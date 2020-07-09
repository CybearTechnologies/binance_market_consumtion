package com.example.cybear.prueba.chinchin.products.Services;

import com.example.cybear.prueba.chinchin.products.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private RestTemplate _restTemplate;

    public ProductService(@Autowired RestTemplateBuilder _restTemplateBuilder) {
        this._restTemplate = _restTemplateBuilder.build();
    }

    @Override
    public List<Product> getProductList() {
        String url = "https://www.binance.com/exchange-api/v1/public/asset-service/product/get-products";
        ResponseEntity<List<Product>> response =
                _restTemplate.exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Product>>() {
                        });
        return response.getBody();
    }
}
