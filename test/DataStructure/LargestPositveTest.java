package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LargestPositveTest {
    @Test
    public void testThatThreeIsTheNumber(){
            int [] array ={-1,2,-3,3};
            int expected = 3;
            assertEquals(expected,LargestPositve.findMaxK(array));


    }

    @Test
    public void testThatIfLongestNumberDoesntExistReturnMinus1(){
        int [] array ={-10,8,6,7,-2,-3};
        int expected = -1;
        assertEquals(expected,LargestPositve.findMaxK(array));


    }
  
}