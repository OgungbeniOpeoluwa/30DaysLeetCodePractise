package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeMaximumPairSumTest {
    @Test
    public void testForMaximumPair(){
        int [] number = {3,5,4,2,4,6};
        int expected = 8;
        assertEquals(expected,MinimizeMaximumPairSum.maximumSumFunction(number));
    }
    @Test
    public void testForAnotherMaximumPair(){
        int [] number = {3,5,2,3};
        int expected = 7;
        assertEquals(expected,MinimizeMaximumPairSum.maximumSumFunction(number));
    }
    @Test
    public void testSortFunction(){
        int [] number = {3,5,4,2,4,6};
        int [] expected = {6,5,4,4,3,2};
        assertArrayEquals(expected,MinimizeMaximumPairSum.sortFromAscendingToDecending(number));
    }


}