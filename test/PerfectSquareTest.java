import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquareTest {
    @Test
    public void return3AsTheLeastSumOf12Test(){
        int number = 12;
        int result = 3;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }

}