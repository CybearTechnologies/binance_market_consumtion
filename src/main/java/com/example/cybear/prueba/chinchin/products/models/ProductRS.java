package com.example.cybear.prueba.chinchin.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

//Clase que obtiene la respuesta de la API binance.
public class ProductRS {
    private String _code;
    private String _message;
    private String _messageDetail;
    private List<Product> _data;
    private boolean _success;

    public ProductRS(
            @JsonProperty("code") String code,
            @JsonProperty("message") String message,
            @JsonProperty("messageDetail") String messageDetail,
            @JsonProperty("data") List<Product> data,
            @JsonProperty("success") boolean success) {
        _code = code;
        _message = message;
        _messageDetail = messageDetail;
        _data = data;
        _success = success;
    }

    public String get_code() {
        return _code;
    }

    public String get_message() {
        return _message;
    }

    public String get_messageDetail() {
        return _messageDetail;
    }

    public List<Product> get_data() {
        return _data;
    }

    public boolean is_success() {
        return _success;
    }

    public void set_code(String _code) {
        this._code = _code;
    }

    public void set_message(String _message) {
        this._message = _message;
    }

    public void set_messageDetail(String _messageDetail) {
        this._messageDetail = _messageDetail;
    }

    public void set_data(List<Product> _data) {
        this._data = _data;
    }

    public void set_success(boolean _success) {
        this._success = _success;
    }

    @Override
    public String toString() {
        return "ProductRS{" +
                "_code='" + _code + '\'' +
                ", _message='" + _message + '\'' +
                ", _messageDetail='" + _messageDetail + '\'' +
                ", _data=" + _data +
                ", _success=" + _success +
                '}';
    }
}
