package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    public void testThatParenthesesIsValid(){
        String input ="()";
        assertTrue(ValidParenthenses.checkIfParenthesesIsValid(input));


    }
    @Test
    public void testThatAnotherParenthesesIsValid(){
        String input ="()[]{}";
        assertTrue(ValidParenthenses.checkIfParenthesesIsValid(input));

    }
    @Test
    public void testThatParenthesesIsNotValid(){
        String input ="(]";
        assertFalse(ValidParenthenses.checkIfParenthesesIsValid(input));

    }
    @Test
    public void testAnotherValidParentheses(){
        String input = "([)]";
        assertTrue(ValidParenthenses.checkIfParenthesesIsValid(input));

    }
    


}