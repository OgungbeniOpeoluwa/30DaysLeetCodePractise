package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    @Test
     public void  testThatSecondStringIsTheAnagramOfTheFirstString(){
        String firstWord = "anagram";
        String secondWord = "nagaram";
        assertTrue(ValidAnagram.validAnagramFunction(firstWord,secondWord));
    }
    @Test
    public void  testThatFirstLengthIsGreaterThatSecondLengthReturnsFalse(){
        String firstWord = "ab";
        String secondWord = "a";
        assertFalse(ValidAnagram.validAnagramFunction(firstWord,secondWord));
    }
    @Test
    public void  testThatSecondStringIsNotTheAnagramOfTheFirstString(){
        String firstWord = "rat";
        String secondWord = "cat";
        assertFalse(ValidAnagram.validAnagramFunction(firstWord,secondWord));
    }

}