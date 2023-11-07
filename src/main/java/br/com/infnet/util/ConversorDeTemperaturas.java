package br.com.infnet.util;

public class ConversorDeTemperaturas {
    public double celciusParaKelvin(double celcius) {
        return celcius + 273.15;
    }

    public double celciusParaFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public double kelvinParaCelcius(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 1.8 + 32;
    }


}
