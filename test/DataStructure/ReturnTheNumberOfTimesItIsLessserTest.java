package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnTheNumberOfTimesItIsLessserTest {
    @Test
    public void testThatWhenIHaveAnArraysOfNumbersItReturnsTheNumberItLesserThanEachOther(){
        int [] array = {1,3,2,7};
        int [] expectedArray ={0,2,1,3};
        assertArrayEquals(expectedArray,ReturnTheNumberOfTimesItIsLessser.returnsNumberOfTimes(array));
    }
    @Test
    public void testThatWhenIHaveAnotherArraysOfNumbersItReturnsTheNumberItLesserThanEachOther(){
        int [] array = {5,5,5,5};
        int [] expectedArray ={0,0,0,0};
        assertArrayEquals(expectedArray,ReturnTheNumberOfTimesItIsLessser.returnsNumberOfTimes(array));
        }
    @Test
    public void testThatWhenIHaveAnotherArraysOfNumbersWithMinusItReturnsTheNumberItLesserThanEachOther(){
        int [] array = {-40,-16,-59,-5};
        int [] expectedArray ={1,2,0,3};
        assertArrayEquals(expectedArray,ReturnTheNumberOfTimesItIsLessser.returnsNumberOfTimes(array));
    }


}