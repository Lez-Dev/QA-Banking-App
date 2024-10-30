package org.qa.Wednesday.CalculatorTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.qa.Wednesday.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubtractTest {

    @Test
    public void testSubtract() {
        int a = 10;
        int b = 3;
        int expected = 7;
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(a,b);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideNumbersForSubtraction() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(1, 5, -4),
                Arguments.of(6, 1, 5),
                Arguments.of(0, 0, 0),
                Arguments.of(100, 5, 95)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForSubtraction")
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(a, b);

        assertEquals(expected, actual);
    }
}
