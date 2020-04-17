package PrimeFactors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberCheckerTest {

    private PrimeNumberChecker pc;


    @BeforeEach
    public void Setup() {
        pc = new PrimeNumberChecker();
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10, 12})
    public void CheckNonPrimeNumbers(int number) {
        boolean result = pc.IsPrime(number);
        assertFalse(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 47})
    public void CheckPrimeNumbers(int number) {
        boolean result = pc.IsPrime(number);
        assertTrue(result);
    }
}