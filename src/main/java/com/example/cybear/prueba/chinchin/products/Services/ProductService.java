package com.example.cybear.prueba.chinchin.products.Services;

import com.example.cybear.prueba.chinchin.products.logic.Command;
import com.example.cybear.prueba.chinchin.products.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private Command<List<Product>> _commandGetProducts;


    @Autowired
    public ProductService(@Qualifier("commandGetProducts") Command<List<Product>> commandGetProducts) {
        _commandGetProducts = commandGetProducts;
    }

    @Override
    public List<Product> getProductList() {
        _commandGetProducts.execute();
        return _commandGetProducts.Return();
    }
}
