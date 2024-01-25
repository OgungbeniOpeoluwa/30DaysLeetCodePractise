package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPlusOneTest {
    @Test
    public void testThatWhenAArrayOfNumberIsGiverAddPlusOne(){
        int [] input = {1,2,9};
        int [] expected={1,3,0};
        assertArrayEquals(expected,ArrayPlusOne.plusOne(input));

    }
    @Test
    public void testThatWhenAnotherArrayOfNumberIsGiverAddPlusOne(){
        int [] input = {9};
        int [] expected={1,0};
        assertArrayEquals(expected,ArrayPlusOne.plusOne(input));

    }
    @Test
    public void testThatWhenArrayOfNumberIsGiverAddPlusOne(){
        int [] input = {4,3,2,1};
        int [] expected={4,3,2,2};
        assertArrayEquals(expected,ArrayPlusOne.plusOne(input));

    }

}