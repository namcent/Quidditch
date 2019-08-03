package test.java;

import main.java.Cazador;
import main.java.Equipo;
import main.java.Nimbus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
    private Cazador cazador;
    private Nimbus nimbus;
    private Equipo equipo;

    @BeforeEach
    void setup(){
        roberta = new Nimbus(1999, 50.0);
        harrypotter = new Cazador(10.0, 5.0, 75.0, 5.0, roberta);
        griffindor = new Equipo();
    }

    @Test
    void velocidadJugador(){}
}
