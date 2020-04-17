package PrimeFactors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class PrimeFactorsGeneratorTest {

    private PrimeFactorsGenerator generator;


    @BeforeEach
    void setUp() {
        generator = new PrimeFactorsGenerator();
    }


    @Test
    public void PrimeFactorsOf2() {
        List<Integer> factors = generator.generatePrimeFactors(2);
        List<Integer> expected = list(2);
        assertEquals(expected, factors);
    }


    @Test
    public void PrimeFactorsOf3() {
        List<Integer> factors = generator.generatePrimeFactors(3);
        List<Integer> expected = list(3);
        assertEquals(expected, factors);
    }


    @Test
    public void PrimeFactorsOf4() {
        List<Integer> factors = generator.generatePrimeFactors(4);
        List<Integer> expected = list(2, 2);
        assertEquals(expected, factors);
    }


    private List<Integer> list(int... input) {
        ArrayList<Integer> expected = new ArrayList<>();
        for (var integer : input) {
            expected.add(integer);
        }
        return expected;
    }
}