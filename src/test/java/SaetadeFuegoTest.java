package test.java;

import main.java.SaetaDeFuego;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaetadeFuegoTest {

    private SaetaDeFuego escoba1 ;

    @BeforeEach
    void setUp(){
        escoba1= new SaetaDeFuego();
    }



    @Test

    void velocidadDeEscobaTest (){

        assertEquals(100.0,escoba1.velocidadEscoba());
    }
}
