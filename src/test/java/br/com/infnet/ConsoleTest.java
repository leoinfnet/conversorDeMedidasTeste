package br.com.infnet;

import br.com.infnet.exceptions.TemperaturaInvalidaException;
import br.com.infnet.util.ConsoleUtil;
import br.com.infnet.util.ConversorDeTemperaturas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConsoleTest {
    @Test
    @DisplayName("Deve retornar uma exception caso um valor invalido seja escolhido")
    public void testaEscolhaErrada(){
        ConsoleUtil escolha = new ConsoleUtil();
        escolha.escolher("C");
        escolha.escolher("F");
        escolha.escolher("K");
        assertThrows(TemperaturaInvalidaException.class, () ->{
            ConsoleUtil escolha2 = new ConsoleUtil();
            escolha2.escolher("P");
        });



    }
}
