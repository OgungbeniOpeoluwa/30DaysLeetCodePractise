package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonNumberTest {
    @Test
    public void return3AsTheLowestNumberThatAppearInTheTwoArrayTest(){
        int [] input ={2,-3,5,6,7,8};
        int [] input2 ={1,-3,7,10,11,8};
        assertEquals(-3,LowestCommonNumber.returnLowestCommonFactor(input,input2));
    }
    @Test
    public void return9AsTheLowestNumberThatAppearInTheTwoArrayTest(){
        int [] input ={5,4,11,13,9};
        int [] input2 ={9,11,15,1,14};
        assertEquals(9,LowestCommonNumber.returnLowestCommonFactor(input,input2));
    }

}