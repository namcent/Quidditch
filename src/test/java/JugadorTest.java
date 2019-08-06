package test.java;

import main.java.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JugadorTest {
    private Buscador harrypotter;
    private Cazador jugador1;
    private Guardian jugador2;
    private Cazador jugador3;
    private Cazador jugador4;
    private Golpeador jugador5;
    private Golpeador jugador6;

    private Buscador jugadorcontr1;
    private Cazador jugadorcontr2;
    private Guardian jugadorcontr3;
    private Cazador jugadorcontr4;
    private Cazador jugadorcontr5;
    private Golpeador jugadorcontr6;
    private Golpeador jugadorcontr7;

    private Nimbus escoba1;
    private SaetaDeFuego escoba2;
    private Equipo griffindor;
    private Equipo slytherin;
    private List<Jugador> jugadores;


//2 golpeadores, 3 cazadores y 1 buscador

    @BeforeEach
    void setup(){
        escoba1 = new Nimbus(1999, 50.0);
        griffindor = new Equipo();
        slytherin= new Equipo();

        harrypotter = new Buscador(10, 5, 75.0, 5, escoba1, griffindor);
        jugador1= new Cazador(15, 10,45.0,16, escoba1, griffindor);
        jugador2=new Guardian(10, 15, 75.0, 26, escoba2, griffindor);
        jugador3=new Cazador(15, 16, 80.0, 15, escoba2, griffindor);
        jugador4= new Cazador(16, 60, 90.0, 24, escoba2, griffindor);
        jugador5=new Golpeador(64, 75, 85.0, 54, escoba1, griffindor);
        jugador6=new Golpeador(15, 16, 80.0, 15, escoba2, griffindor);

        jugadorcontr1=new Buscador(15, 16, 80.0, 15, escoba2, slytherin);
        jugadorcontr2= new Cazador(16, 60, 90.0, 24, escoba2, slytherin);
        jugadorcontr3=new Guardian(64, 75, 85.0, 54, escoba1, slytherin);
        jugadorcontr4=new Cazador(15, 16, 80.0, 15, escoba2, slytherin);
        jugadorcontr5= new Cazador(16, 60, 90.0, 24, escoba2, slytherin);
        jugadorcontr6=new Golpeador(64, 75, 85.0, 54, escoba1, slytherin);
        jugadorcontr7=new Golpeador(15, 16, 80.0, 15, escoba2, slytherin);



        griffindor.agregarJugador(harrypotter);
        griffindor.agregarJugador(jugador1);
        griffindor.agregarJugador(jugador2);
        griffindor.agregarJugador(jugador3);
        griffindor.agregarJugador(jugador4);
        griffindor.agregarJugador(jugador5);
        griffindor.agregarJugador(jugador6);

        slytherin.agregarJugador(jugadorcontr1);
        slytherin.agregarJugador(jugadorcontr2);
        slytherin.agregarJugador(jugadorcontr3);
        slytherin.agregarJugador(jugadorcontr4);
        slytherin.agregarJugador(jugadorcontr5);
        slytherin.agregarJugador(jugadorcontr6);
        slytherin.agregarJugador(jugadorcontr7);
    }

    @Test
    void velocidadJugador(){}
}
