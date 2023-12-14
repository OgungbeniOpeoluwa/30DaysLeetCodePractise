package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceBetweenZeroAndOneInRowAndColoumnTest {
    @Test
    public void testDifferenceOfZeroAndOneInArray(){
        int [][] array = {{0,1,1},{1,0,1},{0,0,1}};
        int [][] expected = {{0,0,4},{0,0,4},{-2,-2,2}};
        assertArrayEquals(expected,DifferenceBetweenZeroAndOneInRowAndColoumn.diffrenceMatrixFunction(array));
    }
    @Test
    public void testAnotherDifferenceOfZeroAndOneInArray(){
        int [][] array = {{1,1,1},{1,1,1}};
        int [][] expected = {{5,5,5},{5,5,5}};
        assertArrayEquals(expected,DifferenceBetweenZeroAndOneInRowAndColoumn.diffrenceMatrixFunction(array));
    }


}