package test.java;

import main.java.Cazador;
import main.java.Nimbus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
    private Cazador cazador;
    private Nimbus nimbus;

    @BeforeEach
    void setup(){
        jonasa = new Nimbus(1999, 50.0);
        pepito = new Cazador(10.0, 5.0, 75.0, 5.0, jonasa);
    }

    @Test
    void velocidadJugador(){}
}
