package test.java;

import main.java.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JugadorTest {
    private Buscador harrypotter;
    private Cazador jugador1;
    private Guardian jugador2;
    private Buscador jugadorcontr1;
    private Cazador jugadorcontr2;
    private Guardian jugadorcontr3;
    private Nimbus roberta;
    private Nimbus escoba1;
    private SaetaDeFuego escoba2;
    private Equipo griffindor;
    private Equipo slytherin;
    private List<Jugador> jugadores;


//2 golpeadores, 3 cazadores y 1 buscador

    @BeforeEach
    void setup(){
        roberta = new Nimbus(1999, 50.0);
        griffindor = new Equipo();
        slytherin= new Equipo();
        harrypotter = new Buscador(10, 5, 75.0, 5, roberta, griffindor);
        jugador1= new Cazador(15, 10,45.0,16, escoba1, griffindor);
        jugador2=new Guardian(10, 15, 75.0, 26, escoba2, griffindor);
        jugadorcontr1=new Buscador(15, 16, 80.0, 15, escoba2, slytherin);
        jugadorcontr2= new Cazador(16, 60, 90.0, 24, escoba2, slytherin);
        jugadorcontr3=new Guardian(64, 75, 85.0, 54, escoba1, slytherin);


        griffindor.agregarJugador(harrypotter);
        griffindor.agregarJugador(jugador1);
        griffindor.agregarJugador(jugador2);

        slytherin.agregarJugador(jugadorcontr1);
        slytherin.agregarJugador(jugadorcontr2);
        slytherin.agregarJugador(jugadorcontr3);
    }

    @Test
    void velocidadJugador(){}
}
