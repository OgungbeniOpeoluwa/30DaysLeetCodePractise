package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    @Test
    public void reverseNumber(){
        int [] array = {1,2,3,4};
        int [] expected = {4,3,2,1};
        assertArrayEquals(expected,ReverseArray.reverseFunction(array));
    }
    @Test
    public void testForAnotherNumber(){
        int [] array = {305 ,97, 1290, 5591, 5930, 9317, 440 ,6533, 7470};
        int [] expected = {7470, 6533, 440, 9317, 5930, 5591, 1290 ,97 ,305};
        assertArrayEquals(expected,ReverseArray.reverseFunction(array));
    }

}