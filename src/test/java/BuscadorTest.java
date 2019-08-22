package test.java;

import main.java.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuscadorTest {
    private Buscador buscador1 ;
    private Buscador buscador2 ;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin;
    private Quaffle quaffle;

    @BeforeEach
    void setUp() {


        slytherin = mock(Equipo.class);
        escoba1 = mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        buscador1= new Buscador (10,1,100.0, 200,escoba1,gryffindor);
        buscador2= new Buscador(10,1,10.0,10,escoba1,slytherin);
        quaffle = mock (Quaffle.class);

    }

    /** tipoJugadorTest**/

    @Test
    void tipoJugador (){
        assertEquals("Buscador",buscador1.tipoJugador());
    }

    /**habilidadDeJugador Test**/

    @Test

    void habilidadDeJugador (){
        when (escoba1.velocidadEscoba()).thenReturn(100.0);
        assertEquals(410,buscador1.habilidadJugador());
    }

    /**buscarSnitchTest**/

    @Test

    void buscarSnitchTest (){

    }

    /**jugar**/

    //es void

    /**perseguir snitch**/

    //es void

    /**esBlancoUtil Test**/

    @Test
    void esBlancoUtilTest (){

    }

    /**puedeBloquearTest**/

    @Test

    void puedeBloquearTest (){
        //quise importar el assertFalse y no me dejo//
        assertEquals(false, buscador1.puedeBloquear(buscador2));
    }

}
