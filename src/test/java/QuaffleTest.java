import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QuaffleTest {


    private Quaffle queaffleA;

        @BeforeEach

        void setUp (){

            queaffleA = new Quaffle ();
        }

    @Test

    void tipoPelotaTest(){

            assertEquals("Quaffle",queaffleA.tipoPelota());
    }

}

