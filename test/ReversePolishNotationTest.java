import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationTest {
    @Test
    public void testThatTheReversePolishNotationOfThisExpressionIsNine(){
        String [] input = {"2","1","+","3","*"};
        int expected = 9;
        assertEquals(expected,ReversePolishNotation.returnReversePolish(input));

    }

    @Test
    public void testThatTheReversePolishNotationOfThisExpressionIs22(){
        String [] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int expected = 22;
        assertEquals(expected,ReversePolishNotation.returnReversePolish(input));

    }
    @Test
    public void testThatTheReversePolishNotationOfThisExpressionIs6(){
        String [] input =  {"4","13","5","/","+"};
        int expected = 6;
        assertEquals(expected,ReversePolishNotation.returnReversePolish(input));

    }

}