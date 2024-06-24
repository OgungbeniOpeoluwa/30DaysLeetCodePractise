import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    @Test
    public void twoHasCommonValueInArrayTest(){
        int [] num1 = {7,2,3};
        int [] num2 = {2,4};
        int expected =  2;
        assertEquals(expected,MinimumCommonValue.getCommon(num1,num2));
    }

}