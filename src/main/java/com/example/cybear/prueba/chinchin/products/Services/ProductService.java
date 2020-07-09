package com.example.cybear.prueba.chinchin.products.Services;

import com.example.cybear.prueba.chinchin.products.logic.Command;
import com.example.cybear.prueba.chinchin.products.models.Product;
import com.example.cybear.prueba.chinchin.products.models.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private Command<List<Product>> _commandGetProducts;
    private Command<List<Product>> _commandTransformPrices;


    @Autowired
    public ProductService(@Qualifier("commandGetProducts") Command<List<Product>> commandGetProducts,
                          @Qualifier("commandTransformPrices") Command<List<Product>> commandTransformPrices
    ) {
        _commandGetProducts = commandGetProducts;
        _commandTransformPrices = commandTransformPrices;
    }

    @Override
    public List<Product> getProductList() {
        _commandGetProducts.execute();
        return _commandGetProducts.Return();
    }

    public List<Product> getEquivalentPrice(Request request) {
        _commandTransformPrices.init(request);
        _commandTransformPrices.execute();
        return _commandTransformPrices.Return();
    }
}
