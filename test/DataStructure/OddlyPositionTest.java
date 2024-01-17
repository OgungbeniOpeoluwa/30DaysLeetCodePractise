package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddlyPositionTest {
    @Test
    public void testThatIfIHaveAnArrayOfSevenLengthItReturnsTheOddlyPositionNumberInTheArray(){
        int [] array ={-1,2,3,4,5,6,77};
        int [] arrayReturn = {1,3,5,7};
        assertArrayEquals(arrayReturn,OddlyPosition.oddlyPosition(array));

    }
    @Test
    public void testThatAnotherIfIHaveAnArrayOfSevenLengthItReturnsTheOddlyPositionNumberInTheArray(){
        int [] array ={1,2,3};
        int [] arrayReturn = {1,3};
        assertArrayEquals(arrayReturn,OddlyPosition.oddlyPosition(array));

    }


}