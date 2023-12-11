package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnElementThatAppear25PercentTimesTest {
    @Test
    public void returnElementThatAppear25PercentTimes(){
        int [] arr = {1,2,2,6,6,6,6,7,10};
        int expected = 6;
        assertEquals(expected,ReturnElementThatAppear25PercentTimes.returnFunction(arr));
    }
    @Test
    public void returnAnotherElementThatAppear25PercentTimes(){
        int [] arr = {1,1};
        int expected = 1;
        assertEquals(expected,ReturnElementThatAppear25PercentTimes.returnFunction(arr));
    }


}