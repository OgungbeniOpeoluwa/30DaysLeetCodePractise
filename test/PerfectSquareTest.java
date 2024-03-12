import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquareTest {
    @Test
    public void return3AsTheLeastSumOf12Test(){
        int number = 12;
        int result = 3;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }

    @Test
    public void return3AsTheLeastSumOf48Test(){
        int number = 48;
        int result = 3;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }

    @Test
    public void return3AsTheLeastSumOf19Test(){
        int number = 19;
        int result = 3;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }

        @Test
        public void return2AsTheLeastSumOf13Test(){
            int number = 13;
            int result = 2;
            assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
        }

    @Test
    public void return3AsTheLeastSumOf43Test(){
        int number = 43;
        int result = 3;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }
    @Test
    public void return3AsTheLeastSumOf133Test(){
        int number = 133;
        int result = 4;
        assertEquals(result,PerfectSquare.returnFewestPerfectSquare(number));
    }

}