package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    public void rotateArray(){
        int number = 2;
        int [] array ={1,2,3,4,5};
        int [] expected = {3,4,5,1,2};
        assertArrayEquals(expected,RotateArray.rotateFunction(array,number));
    }
    @Test
    public void rotateAnotherArray(){
        int number = 4;
        int [] array ={1,2,3,4,5};
        int [] expected = {5,1,2,3,4};
        assertArrayEquals(expected,RotateArray.rotateFunction(array,number));
    }

}