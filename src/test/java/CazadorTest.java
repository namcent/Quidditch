package test.java;

import main.java.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CazadorTest {

    private Cazador cazador1;
    private Cazador cazador2;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin ;

    @BeforeEach
    void setUp() {

        slytherin= mock(Equipo.class);
        escoba1= mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        cazador1 = new Cazador (100, 110, 100.0, 200, escoba1, gryffindor);
        cazador2 = new Cazador (10, 10, 100.0, 10, escoba1, slytherin);
    }

    @Test

    void habilidadJugadorTest (){
        assertEquals(   , cazador1.habilidadJugador());
    }





    /** puede bloquear**/


    /**tipo jugador**/

    /**perdes la pelota**/

    /**metio gol**/

    /**jugar**/

    /** intenta meter gol**/



}
