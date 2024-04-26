import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdealSubSequenceTest {
    @Test
    public void testTTHeLongestIdealSubsequenceInStrings(){
        String  s = "acfgbd";
        int check = 2;
        int expected = 4;
        assertEquals(expected,IdealSubSequence.returnIdealSubSequenceLength(s,check));
    }
    @Test
    public void testTTHeLongestIdealSubsequenceInAnotherStrings(){
        String  s = "eduktdb";
        int check = 15;
        int expected = 5;
        assertEquals(expected,IdealSubSequence.returnIdealSubSequenceLength(s,check));
    }

}