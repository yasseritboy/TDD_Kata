package Odd_Even;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySumCheckerTest {


    private ArraySumChecker arraySumChecker;

    @BeforeEach
    public void Setup() {
        arraySumChecker = new ArraySumChecker();
    }

    @Test
    public void CheckNull() {

        String result = arraySumChecker.checkSumElements(null);
        assertEquals("", result);
    }

    @Test
    public void checkSumEvenElement() {
        int[] x = {1, 2, 3};
        String result = arraySumChecker.checkSumElements(x);
        assertEquals("even", result);

        int[] array2 = {1, 2, 3};
        String result2 = arraySumChecker.checkSumElements(array2);
        assertEquals("even", result2);
    }

    @Test
    public void checkSumOddElement() {
        int[] x = {1, 2, 5};
        String result = arraySumChecker.checkSumElements(x);
        assertEquals("even", result);

        int[] array2 = {1, 0, 5};
        String result2 = arraySumChecker.checkSumElements(array2);
        assertEquals("even", result2);
    }


}