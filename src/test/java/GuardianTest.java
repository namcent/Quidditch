import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GuardianTest {
    private Guardian guardian1;
    private Guardian guardian2;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin;
    private Guardian guardian3;
    private Quaffle quaffle;


    @BeforeEach
    void setUp() {


        slytherin = mock(Equipo.class);
        escoba1 = mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        guardian1 = new Guardian(100, 110, 100.0, 200.0, escoba1, gryffindor, quaffle);
        guardian2 = new Guardian(10, 10, 100.0, 10.0, escoba1, slytherin, quaffle);
        guardian3 = new Guardian(50, 80, 100., 300.0, escoba1, slytherin, quaffle);
        quaffle = mock (Quaffle.class);

    }


    @Test

    void habilidadJugadorTest (){

        when(escoba1.velocidadEscoba()).thenReturn(100.0);

        assertEquals(610.0, guardian1.habilidadJugador());
    }

    @Test
    //COMO LE SETEO LA QUAFFLE ANTES

    void esBlancoUtilTest(){

    }

    @Test
    //COMO LE PASO UN NUMERO EN THEN RETURN. COMO MANEJO UN RANDOM

    void puedeBloquaerTest (){

        assertTrue(guardian1.puedeBloquear(guardian2));

    }




}
