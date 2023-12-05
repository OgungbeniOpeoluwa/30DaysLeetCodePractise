import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementGivenEndOfArrayTest {
    @Test
    public void testThatNumberGivenIsShiftedToTheBack(){
        int [] arrays = {2,1,2,2,2,3,4,2};
        int [] expected = {1,3,4,2,2,2,2,2};
        assertArrayEquals(expected,MoveElementGivenEndOfArray.moveFunction(arrays,2));
    }
    @Test
    public void testThatAnotherNumberGivenIsShiftedToTheBack(){
        int [] arrays = {2,1,5,2,5,3,4,5};
        int [] expected = {1,3,4,2,2,5,5,5};
        assertArrayEquals(expected,MoveElementGivenEndOfArray.moveFunction(arrays,5));
    }


}