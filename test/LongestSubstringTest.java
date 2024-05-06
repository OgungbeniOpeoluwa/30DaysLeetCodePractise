import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    @Test
    public void return3AsLongestSubstring(){
       String s = "abcabcbb";
       int count = 3;
       assertEquals(count,LongestSubstring.lengthOfLongestSubstring(s));
    }
    @Test
    public void return1AsLongestSubstring(){
        String s = "bbbbbb";
        int count = 1;
        assertEquals(count,LongestSubstring.lengthOfLongestSubstring(s));
    }

    @Test
    public void return3AsLongestSubstringInPwwkew(){
        String s = "pwwkew";
        int count = 3;
        assertEquals(count,LongestSubstring.lengthOfLongestSubstring(s));
    }

    @Test
    public void return2AsLongestSubstringInAab(){
        String s = "aab";
        int count = 2;
        assertEquals(count,LongestSubstring.lengthOfLongestSubstring(s));
    }
    @Test
    public void return2AsLongestSubstringInDvdf(){
        String s = "dvdf";
        int count = 3;
        assertEquals(count,LongestSubstring.lengthOfLongestSubstring(s));
    }


}