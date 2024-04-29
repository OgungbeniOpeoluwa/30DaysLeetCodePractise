import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSubarrayTest {
    @Test
    public void countSubArrayInArrayTest(){
        int [] array = {1,3,2,3,3};
        int k = 2;
        assertEquals(6,CountSubarray.returnMaxSubarray(array,k));
    }

    @Test
    public void countSubArrayInArrayMaxTest(){
        int [] array = {1,4,2,1};
        int k = 3;
        assertEquals(0,CountSubarray.returnMaxSubarray(array,k));
    }


}