import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinnerOfArrayGameTest {
    @Test
    public void winnerOfArrayGameIs5(){
        int [] value = {2,1,3,5,4,6,7};
        int rounds = 2;
        int answer = 5;
        System.out.println(WinnerOfArrayGame.returnWinnerInArrayGame(value,rounds));
        assertEquals(answer,WinnerOfArrayGame.returnWinnerInArrayGame(value,rounds));
    }
    @Test
    public void winnerOfArrayGameIs3(){
        int [] value = {3,1,2};
        int rounds = 10;
        int answer = 3;
        System.out.println(WinnerOfArrayGame.returnWinnerInArrayGame(value,rounds));
        assertEquals(answer,WinnerOfArrayGame.returnWinnerInArrayGame(value,rounds));
    }


}