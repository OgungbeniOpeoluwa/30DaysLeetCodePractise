import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormCharacterInWordTest {
    @Test
    public void testIfStringArrayIsGood(){
        String [] value = {"cat","bt","hat","tree"};
        String chars = "atach";
        assertEquals(6,FormCharacterInWord.returnLengthOfGoodString(value,chars));
    }
    @Test
    public  void testIfStringIsGoodAndReturnLength(){
        String [] words = {"hello","world","leetcode"} ;
        String chars = "welldonehoneyr";
        assertEquals(10,FormCharacterInWord.returnLengthOfGoodString(words,chars));
    }

}