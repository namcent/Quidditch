import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class EquipoTest {

    private Cazador cazador1;
    private Cazador cazador2;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin;
    private Cazador cazador3;
    private Golpeador golpeador1;
    private Golpeador golpeador2;
    private Buscador buscador1;
    private Golpeador golpeador3;



    @BeforeEach
    void setUp() {

        slytherin = new Equipo();
        escoba1 = mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = new Equipo();
        cazador1 = mock(Cazador.class);
        cazador2 = mock(Cazador.class);
        cazador3 = mock(Cazador.class);
        buscador1= mock(Buscador.class);
        golpeador1= mock(Golpeador.class);
        golpeador2= mock(Golpeador.class);
        golpeador3=mock (Golpeador.class);



    }

    @Test
    void lePasaElTrapoATodosTest() {
        gryffindor.agregarJugador(cazador1);
        slytherin.agregarJugador(cazador2);
        when(cazador1.habilidadJugador()).thenReturn(800.0);
        when(cazador1.lePasaElTrapo(cazador2)).thenReturn(true);
        assertTrue(slytherin.lePasaElTrapoATodos(cazador1));
    }

    @Test
    void tieneJugadorEstrellaTest() {
        gryffindor.agregarJugador(cazador1);
        slytherin.agregarJugador(cazador2);
        when(cazador1.lePasaElTrapo(cazador2)).thenReturn(true);
        when(slytherin.lePasaElTrapoATodos(cazador1)).thenReturn(true);
        assertTrue(gryffindor.tieneJugadorEstrella(slytherin));

    }


    /** promedioHabilidadEquipo**/

    @Test
    void promedioHabilidadEquipo(){

        when(cazador1.habilidadJugador()).thenReturn(100.0);
        when(golpeador1.habilidadJugador()).thenReturn(400.0);
        when(cazador2.habilidadJugador()).thenReturn(400.0);
        when(golpeador2.habilidadJugador()).thenReturn(200.0);
        when(buscador1.habilidadJugador()).thenReturn(200.0);
        when(cazador3.habilidadJugador()).thenReturn(200.0);
        when(golpeador3.habilidadJugador()).thenReturn(600.0);
        gryffindor.agregarJugador(cazador1);
        gryffindor.agregarJugador(golpeador1);
        gryffindor.agregarJugador(cazador2);
        gryffindor.agregarJugador(golpeador2);
        gryffindor.agregarJugador(buscador1);
        gryffindor.agregarJugador(cazador3);
        gryffindor.agregarJugador(golpeador3);
        assertEquals(300.0,gryffindor.promedioHabilidadEquipo());
    }

    //random//

    //jugadorQueJuegaElTurno//

    /**puedenBloquear**/

    // List<Jugador> listaDeCazadores//

    /**cazadorMasRapido**/




}








