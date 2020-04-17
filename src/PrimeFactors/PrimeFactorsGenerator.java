package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsGenerator {

    public List<Integer> generatePrimeFactors(int number) {
        var pc = new PrimeNumberChecker();
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= (number); i++)
            if (pc.IsPrime(i)) {
                factors.add(i);
                number -= i;
                i = 2;
            }

        return factors;

    }
}
