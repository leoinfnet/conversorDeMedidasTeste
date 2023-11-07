package br.com.infnet.exceptions;

public class TemperaturaInvalidaException extends RuntimeException {
    public TemperaturaInvalidaException() {
    }

    public TemperaturaInvalidaException(String message) {
        super(message);
    }
}
