package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsGenerator {

    public List<Integer> generatePrimeFactors(int number) {
        var pc = new PrimeNumberChecker();
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i <= number) {
            if (pc.IsPrime(i)) {
                factors.add(i);
                number /= i;
            }

            i++;
        }
        return factors;

    }
}
