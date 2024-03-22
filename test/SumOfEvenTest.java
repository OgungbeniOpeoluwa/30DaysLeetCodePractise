import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEvenTest {
    @Test
    public void returnSumOfEvenNumbersInTheArray(){
        int [] numb = {1,2,3,4};
        int [] [] quries = {{1,0},{-3,1},{-4,0},{2,3}};
        int [] result = {8,6,2,4};
         assertArrayEquals(result,SumOfEven.returnArraySumOfEven(numb,quries));
    }

    @Test
    public void returnSumOfEvenNumbersInTheArray2(){
        int [] numb = {1};
        int [] [] quries = {{4,0}};
        int [] result = {0};
        assertArrayEquals(result,SumOfEven.returnArraySumOfEven(numb,quries));
    }

}