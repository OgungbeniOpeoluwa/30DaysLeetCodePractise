package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testThatWhenIGiveAnArrayAndTwoTargetItReturnTheSumOfTheNumbers(){
        int [] array = {1,2,3,4};
        int target1 = 2;
        int target2 = 4;
        assertEquals(7,TwoSum.sumTheRangeOfNumbers(array,target1,target2));
    }
    @Test
    public void testThatWhenIGiveAnotherArrayAndTwoTargetItReturnTheSumOfTheNumbers(){
        int [] array = {1,1,2,2,3,4};
        int target1 = 2;
        int target2 = 4;
        assertEquals(9,TwoSum.sumTheRangeOfNumbers(array,target1,target2));
    }

}