import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWayTest {
    @Test
    public void decodeValueTest(){
        String value = "12";
        int result = 2;
        assertEquals(result,DecodeWay.numDecoding(value));
    }

}