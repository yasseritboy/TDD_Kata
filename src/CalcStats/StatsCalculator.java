package CalcStats;

public class StatsCalculator {

    public float findMin(float[] myArray) {
        float min = 0;
        for (float element : myArray) {
            min = min < element ? min : element;
        }
        return min;
    }


    public float findMax(float[] myArray) {
        float max = 0;
        for (float element : myArray) {
            max = max > element ? max : element;
        }
        return max;
    }


    public float findAvg(float[] myArray) {

        float sum = 0;
        for (var element : myArray) {
            sum += element;
        }
        return sum / myArray.length;
    }


    public int getNumOfElements(float[] myArray) {
        return myArray.length;
    }
}
