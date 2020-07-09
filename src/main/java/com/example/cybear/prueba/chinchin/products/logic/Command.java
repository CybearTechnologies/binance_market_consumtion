package com.example.cybear.prueba.chinchin.products.logic;

public interface Command<T> {
    void execute();

    T Return();
}
