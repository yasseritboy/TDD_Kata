package CalcStats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsCalculatorTest {

    private StatsCalculator sc;


    @BeforeEach
    public void Setup() {
        sc = new StatsCalculator();
    }


    @Test
    public void CheckMinInArray() {
        float[] myArray = {3, 2, 4, -1};
        float min = sc.findMin(myArray);
        assertEquals(-1, min);
    }


    @Test
    public void CheckMaxInArray() {
        float[] myArray = {3, 2, 4, -1};
        float max = sc.findMax(myArray);
        assertEquals(4, max);
    }


    @Test
    public void CheckAvgInArray() {
        float[] myArray = {3, 2, 4, -1};
        float avg = sc.findAvg(myArray);
        assertEquals(2, avg);

        float[] myArray2 = {3.6f, 2.4f, 4.5f, -0.5f};
        float avg2 = sc.findAvg(myArray2);
        assertEquals(2.5, avg2);
    }


    @Test
    public void GetNumOfElementInArray() {
        float[] myArray = {3, 2, 4, -1};
        int num = sc.getNumOfElements(myArray);
        assertEquals(4, num);
    }
}