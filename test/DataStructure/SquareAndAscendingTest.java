package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAndAscendingTest {
    @Test
    public void testThatWhenIPutAnArrayItReturnsItSquareInAAscendingForm(){
        int [] array = {1,2,3,4,5,6};
        int[] arrayReturn = {1,4,9,16,25,36};
        assertArrayEquals(arrayReturn,SquareAndAscending.returnArraySquareInAscending(array));
    }
    @Test
    public void testThatAnotherWhenIPutAnArrayItReturnsItSquareInAAscendingForm(){
        int [] array = {-20,10,-4,-9,0};
        int[] arrayReturn = {400,81,16,0,100};
        assertArrayEquals(arrayReturn,SquareAndAscending.returnArraySquareInAscending(array));
    }

}