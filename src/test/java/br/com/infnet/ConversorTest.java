package br.com.infnet;

import br.com.infnet.util.ConversorDeTemperaturas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {
    @Test
    @DisplayName("Deve testar a convsersão de C para K")
    public void testaCelciusPraKelvin(){
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(273.15,conversor.celciusParaKelvin(0D));
        assertEquals(348.13,conversor.celciusParaKelvin(74.98),0.1);
        assertEquals(198.17,conversor.celciusParaKelvin(-74.98),0.1);
    }
    @Test
    @DisplayName("Deve testar a convsersão de C para F")
    public void testaCelciusParaFahrenheit(){
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(32, conversor.celciusParaFahrenheit(0D));
        assertEquals(319.4, conversor.celciusParaFahrenheit(159.7),0.1);
        assertEquals(-69.16, conversor.celciusParaFahrenheit(-56.2));
    }

    @Test
    @DisplayName("Deve testar a convsersão de K para C")
    public void testaKelvinParaCelcius(){
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(-273.15,conversor.kelvinParaCelcius(0.0));
        assertEquals(592.17,conversor.kelvinParaCelcius(865.32),0.01);
        assertEquals(-294.595,conversor.kelvinParaCelcius(-21.445),0.01);
    }
    @Test
    @DisplayName("Deve testar a convsersão de K para F")
    public void testaKelvinParaFahrenheit() {
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        assertEquals(-459.67,conversor.kelvinParaFahrenheit(0.0),0.1);
        assertEquals(-177.412,conversor.kelvinParaFahrenheit(156.81),0.1);
        assertEquals(-942.304,conversor.kelvinParaFahrenheit(-268.13),0.1);

    }

}
