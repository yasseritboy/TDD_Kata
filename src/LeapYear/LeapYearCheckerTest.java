package LeapYear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearCheckerTest {

    private LeapYearChecker lp;

    @BeforeEach
    void setUp() {
        lp = new LeapYearChecker();

    }

    @Test
    public void CheckForNull() {
        var result = lp.checkYear(null);
        assertEquals(false, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2005, 2009})
    public void CheckForNotLeap(int year) {
        var result = lp.checkYear(year);
        assertEquals(false, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2004, 2008})
    public void CheckForLeapYear(int year) {
        var result = lp.checkYear(year);
        assertEquals(true, result);
    }
}