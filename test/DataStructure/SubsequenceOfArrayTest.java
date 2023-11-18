package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceOfArrayTest {
    @Test
    public void testThatArrayIsASubArrayOfAnotherArray(){
        int [] parentArray = {4,9,-8,0,1,7,6};
        int [] subArray = {9,1,7};
        assertTrue(SubsequenceOfArray.validateIfAArrayIsASubArray(parentArray,subArray));
    }
    @Test
    public void testThatArrayIsAnotherSubArrayOfAnotherArray(){
        int [] parentArray = {5,2,1,3,-2,-8,1} ;
        int [] subArray ={3,-8,1};
        assertTrue(SubsequenceOfArray.validateIfAArrayIsASubArray(parentArray,subArray));
    }
    @Test
    public void testThatArrayIsNotASubArrayOfAnotherArray(){
        int [] parentArray = {5,2,1,3,-2,-8,1} ;
        int [] subArray = {3,-8,5};
        assertFalse(SubsequenceOfArray.validateIfAArrayIsASubArray(parentArray,subArray));
    }




}