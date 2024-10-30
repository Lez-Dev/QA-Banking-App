package org.qa.Wednesday.FizzBuzzTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.qa.Wednesday.FizzBuzz;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void getFizzBuzzTest() {
        int a = 15;
        String expected = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getFizzBuzz(a);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideNumbersForFizzBuzz() {
        return Stream.of(
                Arguments.of(3, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "FizzBuzz"),
                Arguments.of(12, "Fizz"),
                Arguments.of(25, "Buzz"),
                Arguments.of(150, "FizzBuzz")
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForFizzBuzz")
    public void testAdd(int a, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getFizzBuzz(a);

        assertEquals(expected, actual);
    }

}
