import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoubleArrayTest {
    @Test
    public void testArray(){
        int [] input = {4,5,8};
        int [] expected = {4,5,8,8,10,16};
        System.out.println(Arrays.toString(DoubleArray.returnTwiceTheArray(input)));
        assertArrayEquals(expected,DoubleArray.returnTwiceTheArray(input));
    }

}