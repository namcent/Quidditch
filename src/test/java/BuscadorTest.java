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
    private main.java.Utils.Functions functions;

    @BeforeEach
    void setUp() {


        slytherin = mock(Equipo.class);
        escoba1 = mock(SaetaDeFuego.class);
        escoba2 = mock(Nimbus.class);
        gryffindor = mock(Equipo.class);
        buscador1= new Buscador (10,100.0,200.0,escoba1,gryffindor,1);
        buscador2= new Buscador(10,10.0,10.0,escoba1,slytherin, 1);
        quaffle = mock (Quaffle.class);
        functions= mock (main.java.Utils.Functions.class);

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
  @Test

  void perseguirSnitchTest(){
      buscador1.setKmsRecorridos(5000.0);
      buscador1.perseguirSnitch();
      assertEquals(210.0, buscador1.skillsJugador);
      //no pruebo parte del equipo porque no tendria que ser mock//
   }

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
