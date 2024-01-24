package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateNumberTest {
    @Test
    public void returnNumberThatIsNotDuplicatedTest(){
        int[]input = {2,2,1,3,3,};
        int output = 1;
        assertEquals(output,DuplicateNumber.returnNumberThatIsNotDuplicated(input));
    }
    @Test
    public void returnAnotherNumberThatIsNotDuplicatedTest(){
        int[]input = {4,3,2,1,1,2,2,3};
        int output = 4;
        assertEquals(output,DuplicateNumber.returnNumberThatIsNotDuplicated(input));
    }
    @Test
    public void return1NumberThatIsNotDuplicatedTest(){
        int[]input = {1};
        int output = 1;
        assertEquals(output,DuplicateNumber.returnNumberThatIsNotDuplicated(input));
    }

}