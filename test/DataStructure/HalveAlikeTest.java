package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalveAlikeTest {
    @Test
    public void testThatWhenSentenceIsDividedIntoTwoTheyAreTheSameLength(){
        String word = "book";
        assertTrue(HalveAlike.isLengthAreTheSameAfterSplit(word));
    }

    @Test
    public void  testThatWordAsTheSameLengthOfVowelSoundWhenDivided(){
        String word  ="tkPAdxpMfJiltOerItiv";
        assertTrue(HalveAlike.checkIfAfterDivideHasTheSameVowelSound(word));

    }
    @Test
    public void  testThatAnotherWordAsTheSameLengthOfVowelSoundWhenDivided(){
        String word  ="textbook";
        assertFalse(HalveAlike.checkIfAfterDivideHasTheSameVowelSound(word));

    }

}