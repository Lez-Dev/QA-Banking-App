package org.qa.Wednesday.Closest21Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.qa.Wednesday.Calculator;
import org.qa.Wednesday.Closest21;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestTo21Test {

    static Stream<Arguments> provideNumbersFor21() {
        return Stream.of(
                Arguments.of(16, 5, 16),
                Arguments.of(41, 5, 5),
                Arguments.of(20, 21, 21),
                Arguments.of(50, 60, 0),
                Arguments.of(10, 21, 21),
                Arguments.of(20, 18, 20),
                Arguments.of(1, 22, 1),
                Arguments.of(22, 23, 0),
                Arguments.of(100, 5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersFor21")
    public void testAdd(int a, int b, int expected) {
        int actual = Closest21.closestTo21(a, b);

        assertEquals(expected, actual);
    }
}
