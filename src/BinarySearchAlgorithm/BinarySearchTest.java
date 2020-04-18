package BinarySearchAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {

    private BinarySearch binarySearch;


    @BeforeEach
    void setUp() {

        int[] sampleArray = {-2, 1, 3, 4, 5, 5, 5, 6, 10, 20};
        binarySearch = new BinarySearch(sampleArray);
    }


    @Test
    void NullArraySearchShouldReturnNotFound() {

        assertEquals(-1, binarySearch.find(null));
    }


    @Test
    void NotExistingElementShouldReturnNotFound() {

        assertEquals(-1, binarySearch.find(999));
    }


    @Test
    void ExistingItemShouldReturnFound() {

        assertEquals(0, binarySearch.find(-2));
    }


    @Test
    void NotSortedArrayItemShouldReturnArrayNotSortedException() {
        int[] sampleArray = {5, 10, 20, 1, 3, -2, 4};
        binarySearch = new BinarySearch(sampleArray);
        assertThrows(ArrayNotSortedException.class, () -> binarySearch.find(-2));
    }

}