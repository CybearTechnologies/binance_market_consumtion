package com.example.cybear.prueba.chinchin.products.logic;

import com.example.cybear.prueba.chinchin.products.models.request.Request;

public interface Command<T> {
    void init(Request request);

    void execute();

    T Return();
}
