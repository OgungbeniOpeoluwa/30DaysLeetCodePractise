import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {
    @Test
    public void testOddEven(){
        int [] input = {4,5,8,8,8,2,9};
        int [] expected = {0,1,0,0,0,0,1};
        assertArrayEquals(expected,OddEven.returnOddinZeroAndEvenInOne(input));
    }

}