import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifyArrayTest {
    @Test
    public void  modifyArray(){
        String [] value = {"h","e","l","l","o"};
        String [] result = {"o","l","l","e","h"};
        assertArrayEquals(result,ModifyArray.reverseString(value));

    }

}