package com.example.cybear.prueba.chinchin.products.logic;

import com.example.cybear.prueba.chinchin.products.Exceptions.NoProductsException;
import com.example.cybear.prueba.chinchin.products.models.Product;
import com.example.cybear.prueba.chinchin.products.models.request.Request;
import com.example.cybear.prueba.chinchin.products.models.response.ProductRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommandGetProducts implements Command<List<Product>> {
    @Value("${binance.api}")
    private String _url;
    private RestTemplate _restTemplate;
    private List<Product> _data;

    @Autowired
    public CommandGetProducts(RestTemplateBuilder _restTemplateBuilder) {
        this._restTemplate = _restTemplateBuilder.build();
    }

    @Override
    public void init(Request request) {
        //no utilizado en get.
    }

    @Override
    public void execute() {
        ProductRS productRS = _restTemplate.getForObject(_url, ProductRS.class);
        if (productRS != null && productRS.get_data().size() > 0) {
            _data = productRS.get_data()
                    .stream()
                    .filter(this::filterq)
                    .filter(this::filters)
                    .collect(Collectors.toList());
        } else
            throw new NoProductsException();
    }


    private boolean filterq(Product product) {
        return product.get_q().equals("USDT");
    }

    private boolean filters(Product product) {
        return product.get_s().equals("BTCUSDT") || product.get_s().equals("ETHUSDT") ||
                product.get_s().equals("DASHUSDT") || product.get_s().equals("EURUSDT") ||
                product.get_s().equals("PTRUSDT") || product.get_s().equals("BSSUSDT");
    }

    private void addCurrencies() {

    }

    @Override
    public List<Product> Return() {
        return _data;
    }
}
