package test.java;
import main.java.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GolpeadorTest {

    private Golpeador golpeador1;
    private Golpeador golpeador2;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin ;
    private Golpeador golpeador3;

    @BeforeEach
    void setUp() {

        slytherin= mock(Equipo.class);
        escoba1= mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        golpeador1 = new Golpeador (10,100, 110, 100.0, 200.0, escoba1, gryffindor);
        golpeador2 = new Golpeador  (10,10, 10, 100.0, 10.0, escoba1, slytherin);
        golpeador3 = new Golpeador (20,50,80,100., 300.0, escoba1, slytherin) ;
    }

    @Test

    void habilidadJugadorTest (){
        when(escoba1.velocidadEscoba()).thenReturn(100.0);
        assertEquals(610.0,golpeador1.habilidadJugador());
    }

    @Test
    //nullpointer

    void jugarTest (){


        golpeador1.jugar(slytherin);
        verify(golpeador1).elegirBlancoUtil(slytherin);

    }

    @Test

    void esBlancoUtil (){

        assertFalse(golpeador1.esBlancoUtil(gryffindor));



    }









}
