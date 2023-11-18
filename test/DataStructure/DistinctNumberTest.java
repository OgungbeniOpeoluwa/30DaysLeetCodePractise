package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctNumberTest {
    @Test
    public void returnThirdMaximumDistinctNumber(){
        int [] number = {3,2,1};
        int result = 1;
        assertEquals(result ,DistinctNumber.thirdMaximumDistinctNumber(number));
    }
    @Test
    public void testForLengthLesserThan3(){
        int [] number = {1,2};
        int result = 2;
        assertEquals(result ,DistinctNumber.thirdMaximumDistinctNumber(number));
    }
    @Test
    public void testForDuplicatesNumbersWithLengthGreaterThan3(){
        int [] number = {3,2,2,1};
        int result = 1;
        assertEquals(result ,DistinctNumber.thirdMaximumDistinctNumber(number));
    }


}