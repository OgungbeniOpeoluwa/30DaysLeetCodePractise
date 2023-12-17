package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    @Test
    public void testThatLengthOfWorldInHelloWorldIs5(){
        String word ="Hello world";
        int expected = 5;
        assertEquals(expected,LengthOfLastWord.lenghtOfLastWord(word));
    }
    @Test
    public void testThatLengthOfAIs1(){
        String word ="a";
        int expected = 1;
        assertEquals(expected,LengthOfLastWord.lenghtOfLastWord(word));
    }
    @Test
    public void testForAnotherLength(){
        String input = "   fly me   to   the moon  ";
        int expected = 4;
        assertEquals(expected,LengthOfLastWord.lenghtOfLastWord(input));
    }

}