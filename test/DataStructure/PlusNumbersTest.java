package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusNumbersTest {
    @Test
    public void testThatWhen(){
        int[] input ={2,3,5,6,7,2, 1};
        int [] expected ={5,11,9, 1};

        assertArrayEquals(expected,PlusNumbers.returnSumOfNumbersInArray(input));
    }
    @Test
    public void testThatAnother(){
        int[] input ={3,4,5,1,5};
        int [] expected ={7,6,5};

        assertArrayEquals(expected,PlusNumbers.returnSumOfNumbersInArray(input));
    }
    @Test
    public void testThatWhenArrayHasOnlyOneNumberItReturnsTheSameNumber(){
        int[] input ={0};
        int [] expected ={0};

        assertArrayEquals(expected,PlusNumbers.returnSumOfNumbersInArray(input));
    }

}