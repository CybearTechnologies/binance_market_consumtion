package com.example.cybear.prueba.chinchin.products.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TransformRQ implements Request {
    private String _currency;
    private BigDecimal _amount;

    public TransformRQ(@JsonProperty("currency") String _currency,
                       @JsonProperty("amount") BigDecimal _amount) {
        this._currency = _currency;
        this._amount = _amount;
    }

    public String get_currency() {
        return _currency;
    }

    public BigDecimal get_amount() {
        return _amount;
    }

    public void set_currency(String _currency) {
        this._currency = _currency;
    }

    public void set_amount(BigDecimal _amount) {
        this._amount = _amount;
    }
}
