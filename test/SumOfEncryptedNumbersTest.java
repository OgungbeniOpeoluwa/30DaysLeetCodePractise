import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEncryptedNumbersTest {
    @Test
    public void returnTheSumOfEncryptedValue(){
        int [] array = {10,20,30};
        int expected = 66;
        assertEquals(expected,SumOfEncryptedNumbers.returnTheEncrpytedNUmberSum(array));
    }

}