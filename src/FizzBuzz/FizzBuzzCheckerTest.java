package FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCheckerTest {

    private FizzBuzzChecker fb;

    @BeforeEach
    void setUp() {
        fb = new FizzBuzzChecker();
    }

    @Test
    public void CheckForNull() {
        String result = fb.checkNumber(null);
        assertEquals("", result);
    }

    @ParameterizedTest
    @CsvSource(value = {"7,7", "11,11"})
    public void CheckForOrdinaryNumber(int input, String expected) {
        String result = fb.checkNumber(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    public void CheckForFizzNumbers(int input) {

        String result = fb.checkNumber(input);
        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    public void CheckForBuzzNumbers(int input) {
        String result = fb.checkNumber(input);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void CheckForFizzBuzzNumbers(int input) {
        String result = fb.checkNumber(input);
        assertEquals("FizzBuzz", result);
    }

}