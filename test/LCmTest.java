import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCmTest {
    @Test
    public void testLCm(){
        int [] array = {12,36,48};
        int result = 144;
        assertEquals(result,LCm.returnLcm(array));
    }

}