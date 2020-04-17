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
            if (sampleArray[i] > sampleArray[i++])
                throw new ArrayNotSortedException();
            if (sampleArray[i] == number)
                return i;
        }
        return -1;
    }
}
