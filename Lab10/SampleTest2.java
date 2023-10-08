import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest2 {
    @ParameterizedTest
    @MethodSource("divideArguments")
    void divideTest(int a, int b, int expectedResult) {
        Sample sample = new Sample();
        int result = sample.divide(a, b);
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> divideArguments() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(10, 5, 2),
                Arguments.of(20, 10, 2)
        );
    }
}
