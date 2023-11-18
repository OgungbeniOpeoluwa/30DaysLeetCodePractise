package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMAxSumTest {
    @Test
    public void sumTheMinAndMaxNumberInArrayOfFive(){
        int [] number = {1,3,5,7,9};
        String numbers = "16  24";
        assertEquals(numbers,MinMAxSum.minMaxFunction(number));
    }

}