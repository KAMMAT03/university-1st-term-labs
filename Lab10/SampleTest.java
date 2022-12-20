import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    public void divide() {
        //given
    int a = 6;
    int b = 2;
    //then
    assertEquals(3, a/b);
    }

    @Test
    public void testDivide() {

        //given
        double a = 13.6;
        double b = 2;

        //then
        assertEquals(6.8,a/b);
    }

}