package br.com.infnet.util;

import br.com.infnet.exceptions.TemperaturaInvalidaException;

import java.util.List;

public class ConsoleUtil {
    public void escolher(String escolha) {
        if(ehMedidaValida(escolha)){
            throw new TemperaturaInvalidaException("Temperatura Inválida");
        }
    }
    private static boolean ehMedidaValida(String escolha) {
        List<String> values = List.of("K", "C","F");
        return !values.contains(escolha);
    }
}
