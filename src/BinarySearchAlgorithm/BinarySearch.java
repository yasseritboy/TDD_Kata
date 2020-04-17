package BinarySearchAlgorithm;

public class BinarySearch {
    private int[] sampleArray;


    public BinarySearch(int[] sampleArray) {
        this.sampleArray = sampleArray;
    }


    public int find(Integer number) {
        if (number == null || sampleArray == null)
            return -1;
        for (int i = 0; i < sampleArray.length; i++) {
            if (i < sampleArray.length - 1 && sampleArray[i] > sampleArray[i + 1])
                throw new ArrayNotSortedException();
            if (sampleArray[i] == number)
                return i;
        }
        return -1;
    }
}
