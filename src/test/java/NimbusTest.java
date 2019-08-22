package test.java;

import main.java.Nimbus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class NimbusTest {
    private Nimbus escobaA;

    @BeforeEach
    void setUp() {

        escobaA= new Nimbus (2000,50.0);
    }

    /** CantdeAniosDesdeFabricacion**/

    @Test
    void CantdeAniondeFabricacionTest (){

        assertEquals(19,escobaA.cantDeAniosDesdeFabricacion());
    }

    /**porcentajedeSalud Test**/

    @Test
    void PorcentajedeSaludTest (){

        assertEquals(0.5, escobaA.getPorcentajeSaludEscoba());
    }

    /** velocidadDeEscobaTest**/

    @Test

    void velocidadDeEscobaTest (){
        assertEquals(30.5, escobaA.velocidadEscoba());
    }

    /**recibeGolpeTest**/

    @Test
    void recibeGolpeTest (){

        //como hago el verify sin mockito

        escobaA.recibeGolpe();

    }
}
