package org.qa.Wednesday.CalculatorTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.qa.Wednesday.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorDivideTest {

    @Test
    public void testDivide() {
        int a = 10;
        int b = 2;
        int expected = 5;
        Calculator calculator = new Calculator();
        int actual = calculator.divide(a,b);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideNumbersForDivision() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(10, 5, 2),
                Arguments.of(100, 10, 10),
                Arguments.of(50, 5, 10),
                Arguments.of(18, 6, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForDivision")
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        int actual = calculator.divide(a, b);

        assertEquals(expected, actual);
    }


}
