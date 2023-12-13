package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    @Test
    public void testThatStringIsAValidPalindrome(){
        int [] array = {1,2,3};
        int [] expected = {1,2,4};
        assertArrayEquals(expected,PlusOne.plusOne(array));
    }
    @Test
    public void testThatWhenTheLastDigitIS(){
        int [] array = {4,3,2,1};
        int [] expected = {4,3,2,2};
        assertArrayEquals(expected,PlusOne.plusOne(array));
    }
    @Test
    public void testThatWhenTheValueArrayIs9_returnArrayOf1And0(){
        int [] array = {9};
        int [] expected = {1,0};
        assertArrayEquals(expected,PlusOne.plusOne(array));
    }

}