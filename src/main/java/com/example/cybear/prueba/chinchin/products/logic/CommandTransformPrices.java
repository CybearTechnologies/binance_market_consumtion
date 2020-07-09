package com.example.cybear.prueba.chinchin.products.logic;

import com.example.cybear.prueba.chinchin.products.Exceptions.IncorrectOptionException;
import com.example.cybear.prueba.chinchin.products.models.Product;
import com.example.cybear.prueba.chinchin.products.models.request.Request;
import com.example.cybear.prueba.chinchin.products.models.request.TransformRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Component
public class CommandTransformPrices implements Command<List<Product>> {
    private TransformRQ _transformRQ;
    private Command<List<Product>> _commandGetProducts;
    private List<Product> _productList;

    @Autowired
    public CommandTransformPrices(@Qualifier("commandGetProducts")
                                          Command<List<Product>> _commandGetProducts) {
        this._commandGetProducts = _commandGetProducts;
    }

    public void init(Request request) {
        _transformRQ = (TransformRQ) request;
    }

    @Override
    public void execute() {
        _commandGetProducts.execute();
        _productList = _commandGetProducts.Return();
        transformPrices();
    }

    private void transformPrices() {
        Optional<Product> product = getProductInList(_transformRQ);
        if (product.isPresent()) {
            Product p = product.get();
            BigDecimal price = p.get_l().multiply(_transformRQ.get_amount()); //precio btc * cantidad de btc
            _productList.forEach(x -> x.set_l(price.divide(x.get_l(), 2, RoundingMode.DOWN))); //divido la cantidad de $ que representan esos btc entre el precio de cada moneda
        } else
            throw new IncorrectOptionException();

    }

    private Optional<Product> getProductInList(TransformRQ transformRQ) {
        return _productList.stream()
                .filter(product1 -> product1.get_s().equals(transformRQ.get_currency()))
                .findFirst();
    }

    public List<Product> Return() {
        return _productList;
    }
}
