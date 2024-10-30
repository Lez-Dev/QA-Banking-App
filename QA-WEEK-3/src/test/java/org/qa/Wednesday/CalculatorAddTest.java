package org.qa.Wednesday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class CalculatorAddTest {

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int expected = 5;
        Calculator calculator = new Calculator();
        int actual = calculator.add(a,b);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideNumbersForAddition() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(1, 1, 2),
                Arguments.of(-1, 1, 0),
                Arguments.of(0, 0, 0),
                Arguments.of(10, 5, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForAddition")
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        int actual = calculator.add(a, b);

        assertEquals(expected, actual);
    }


}
