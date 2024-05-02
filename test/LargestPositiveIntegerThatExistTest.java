import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPositiveIntegerThatExistTest {
    @Test
    public void return3largestPositiveInteger(){
        int [] array = {-1,2,-3,3};
        int result = 3;
        assertEquals(result,LargestPositiveIntegerThatExist.findMax(array));
    }

}