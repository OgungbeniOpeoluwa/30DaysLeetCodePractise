package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringWithSpaceTest {
    @Test
    public void testThatWhenAStringTakesANumberWithSpaceItReturnsTheLowestAndHighestInAnArray(){
        String word = "1 2 3 4 5";
        int [] array = {1,5};
        assertArrayEquals(array,StringWithSpace.returnStringWithSpaceHighestAndLowest(word));
    }
    @Test
    public void testThatWhenAnotherStringTakesANumberWithDoubleSpaceItReturnsTheLowestAndHighestInAnArray(){
        String word = "-1 2 3 4 90";
        int [] array = {-1,90};
        assertArrayEquals(array,StringWithSpace.returnStringWithSpaceHighestAndLowest(word));
    }


}