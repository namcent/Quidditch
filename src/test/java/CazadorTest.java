package test.java;

import main.java.*;
import main.java.Utils.Functions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class CazadorTest {

    private Cazador cazador1;
    private Cazador cazador2;
    private Equipo gryffindor;
    private SaetaDeFuego escoba1;
    private Nimbus escoba2;
    private Equipo slytherin ;
    private Cazador cazador3;
    private Quaffle quaffle;
    private Functions functions;

    @BeforeEach
    void setUp() {

        functions= mock(Functions.class);
        quaffle= mock(Quaffle.class);
        slytherin= mock(Equipo.class);
        escoba1= mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        cazador1 = new Cazador (10,100, 110, 100.0, 200.0, escoba1, gryffindor, quaffle);
        cazador2 = new Cazador (5,10, 10, 100.0, 10.0, escoba1, slytherin, quaffle);
        cazador3= new Cazador (20,50,80,100., 300.0, escoba1, slytherin, quaffle) ;
    }

    /**Habilidad cazador**/
    @Test
    void manejoDeEscobaTest (){
        assertEquals (2, cazador1.nivelManejoDeEscoba()) ;

    }

    @Test
    void velocidadJugadorTest (){
        when( escoba1.velocidadEscoba()).thenReturn(100.0);
        assertEquals(200.0,cazador1.velocidadJugador());

    }

    @Test
    void habilidadCazadorTest (){
        when (escoba1.velocidadEscoba()).thenReturn(100.0);
        assertEquals( 11400.0  , cazador1.habilidadJugador());
    }

    /** puede bloquear**/
    @Test
    void lePasaElTrapoTest (){
        assertTrue (cazador1.lePasaElTrapo(cazador2)) ;
    }
    //se podria ver de hacer una excepcion cuando son iguales?//

    @Test
    void puedeBloquearTest(){
        assertTrue(cazador1.puedeBloquear(cazador2));
    }

    /**tipo jugador**/

    @Test
     void tipoJugadorTest (){
        assertEquals ("Cazador",cazador1.tipoJugador() ) ;

    }

    /**perdes la pelota**/
    @Test
    void perdesLaPelotaTest () {

        cazador1.perdesLaPelota(slytherin);
        verify(slytherin).cazadorMasRapido();

    }
    /**metio gol**/
    @Test

    void metioGolTest (){
        cazador1.setFunctions(functions);
        when(functions.getRandomElement(any())).thenReturn(2);
        assertTrue(cazador1.metioGol());
    }

    /**jugar**/

    @Test
    /**opcion no tan feliz**/
    void jugarNoTanFelizTest(){
        when(gryffindor.puedenBloquear(cazador1)).thenReturn(true);
        when(quaffle.tipoPelota()).thenReturn("Quaffle");
        cazador1.Jugar(slytherin);
        verify(slytherin).cazadorMasRapido();
    }
    /**opcion feliz**/
     @Test
    void jugarOpcionFelizTest(){

     when (gryffindor.puedenBloquear(cazador1)).thenReturn(false);
     when(quaffle.tipoPelota()).thenReturn("Quaffle");
     cazador1.Jugar(slytherin);
     }

     /**intenta meter gol**/

     @Test

    void intetaMeterGol (){

     when(gryffindor.puedenBloquear(cazador1)).thenReturn(true);
     cazador1.intentaMeterGol(slytherin);
     verify(slytherin).cazadorMasRapido();
     }

     /**intenta meter gol pero resultado positivo**/

     /**es blanco util**/

     @Test

    void esBlancoUtil(){
         when(quaffle.tipoPelota()).thenReturn("Quaffle");
         assertTrue(cazador1.esBlancoUtil(gryffindor));
     }



}