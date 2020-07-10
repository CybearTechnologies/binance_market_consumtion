package com.example.cybear.prueba.chinchin.products.Exceptions;

public class IncorrectOptionException extends CustomException {
    public IncorrectOptionException() {
        super("Por favor, seleccionar una opcion valida, BTCUSDT,DASHUSDT,EURUSDT,ETHUSDT,BSSUSDT,PTRUSDT");
    }
}
