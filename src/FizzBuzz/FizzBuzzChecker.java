package FizzBuzz;

public class FizzBuzzChecker {
    public String checkNumber(Integer input) {
        if (input == null)
            return "";
        if (input % 3 == 0 && input % 5 == 0)
            return "FizzBuzz";
        else if (input % 3 == 0)
            return "Fizz";
        else if (input % 5 == 0)
            return "Buzz";
        return input.toString();
    }
}
