package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelSoundTest {
    @Test
    public  void testThatWhenAStringIsGivenItRemoveTheVowelSound(){
        String word= "bath";
        String expected = "bth";
        assertEquals(expected,RemoveVowelSound.returnConsonantString(word));

    }
    @Test
    public  void testThatWhenAnotherStringIsGivenItRemoveTheVowelSound(){
        String word= "a";
        String expected = "";
        assertEquals(expected,RemoveVowelSound.returnConsonantString(word));

    }
    @Test
    public  void testThatWhenIPutAnotherStringIsGivenItRemoveTheVowelSound(){
        String word= "BathROo";
        String expected = "BthR";
        assertEquals(expected,RemoveVowelSound.returnConsonantString(word));

    }

}