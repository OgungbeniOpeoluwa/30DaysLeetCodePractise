import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestThreeSumTest {
    @Test
    public void return777AsargestNumbInString() {
        String number = "6777133339";
        String result  = "777";
        assertEquals(result,LargestThreeSum.returnLargestSumOfDigit(number));
    }




}