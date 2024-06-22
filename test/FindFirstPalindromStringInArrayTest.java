import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstPalindromStringInArrayTest {
    @Test
    public void testThatAdaIsTheFirstPalindromeInArray(){
        String [] value = {"abc","car","ada","racecar","cool"};
        String result = "ada";
        assertEquals(result,FindFirstPalindromStringInArray.firstPalindrome(value));
    }

    @Test
    public void testThatNoPalindromeInArray(){
        String [] value = {"def","ghi"};
        String result = "";
        assertEquals(result,FindFirstPalindromStringInArray.firstPalindrome(value));
    }

}