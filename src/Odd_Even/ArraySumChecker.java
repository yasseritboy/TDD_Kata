package Odd_Even;

public class ArraySumChecker {


    public String checkSumElements(int[] integer) {
        if (integer == null)
            return "";

        int sum = 0;
        for (int element : integer) {
            sum += element;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
