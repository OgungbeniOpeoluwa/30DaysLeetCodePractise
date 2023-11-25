import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteDifferenceInSortedListTest {
    @Test
    public void getAbosoluteSumDiffrence(){
        int [] arrays = {2,3,5};
        int [] expected = {4,3,5};
        assertArrayEquals(expected,AbsoluteDifferenceInSortedList.sumFunction(arrays));
    }

}