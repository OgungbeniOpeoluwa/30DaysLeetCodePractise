package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostAppearTest {
    @Test
    public void testThatWhenANumberAppearMoreItIsReturn(){
        int [] input = {2,1,1,1,1,2,2};
        int result = 1;
        assertEquals(result,MostAppear.returnNumberThatAppearMore(input));

    }
    @Test
    public void testThatWhenAnotherNumberAppearMoreItIsReturn(){
        int [] input = {3,4,5,5,2};
        int result = 5;
        assertEquals(result,MostAppear.returnNumberThatAppearMore(input));

    }

}