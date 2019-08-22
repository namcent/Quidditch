import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnitchTest {

    private Snitch snitchA;

    @BeforeEach

    void setUp (){

        snitchA = new Snitch ();
    }

    @Test

    void tipoPelota () {

        assertEquals("Snitch", snitchA.tipoPelota());

    }






}
