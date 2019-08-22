import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BludgerTest {

    private Bludger bludgerA;

    @BeforeEach

    void setUp (){

        bludgerA = new Bludger ();
    }

    @Test

    void tipoPelotaTest(){

        assertEquals("Bludger",bludgerA.tipoPelota());
    }






    }


