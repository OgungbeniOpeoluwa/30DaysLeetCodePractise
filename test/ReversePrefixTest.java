import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixTest {
   @Test
   public void reverseChIfFound(){
       String word = "abcdefd";
       String ch = "d";
       assertEquals("dcbaefd",ReversePrefix.reversePrefix(word,ch));
   }
    @Test
    public void reverseYIfFound(){
        String word = "xyxzxe";
        String ch = "z";
        assertEquals("zxyxxe",ReversePrefix.reversePrefix(word,ch));
    }

}