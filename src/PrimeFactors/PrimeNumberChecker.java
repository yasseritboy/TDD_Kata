package PrimeFactors;

public class PrimeNumberChecker {
    public boolean IsPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if ((i != number || i != 1) && number % i == 0)
                return false;
        return true;
    }
}
