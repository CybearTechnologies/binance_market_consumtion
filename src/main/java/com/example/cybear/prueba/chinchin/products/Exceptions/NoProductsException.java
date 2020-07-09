package com.example.cybear.prueba.chinchin.products.Exceptions;

public class NoProductsException extends CustomException {
    public NoProductsException() {
        super("There are no products");
    }
}
