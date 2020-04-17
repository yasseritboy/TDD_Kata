package LeapYear;

public class LeapYearChecker {
    public boolean checkYear(Integer year) {
        return year != null && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
