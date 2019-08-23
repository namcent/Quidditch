import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


    @BeforeEach
    void setUp() {

        slytherin = new Equipo();
        escoba1 = mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = new Equipo();
        cazador1 = mock(Cazador.class);
        cazador2 = mock(Cazador.class);
        cazador3 = mock(Cazador.class);


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
        //mock (arrayList<Jufgador>)
        //arraylist (mock <jugador>)
        //no pruebo la lista si no el metodo, hago un assert equals del promedio del equipo, tengo que sacarlo yo a mano)
    }

    //random//

    //jugadorQueJuegaElTurno//

    /**puedenBloquear**/

    // List<Jugador> listaDeCazadores//

    /**cazadorMasRapido**/




}








