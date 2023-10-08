import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SampleTest3 {
    @Test
    void divideByZeroTest() {
        Sample sample = new Sample();
        assertThrows(ArithmeticException.class, () -> sample.divide(1, 0));
        assertDoesNotThrow(() -> sample.divide(1, 1));
    }
}
