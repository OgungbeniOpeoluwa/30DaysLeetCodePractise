import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfTwoElementTest {
    @Test
    public void testMaximumProductInArrayIs12(){
        int [] array = {3,4,5,2};
        int expected = 12;
        assertEquals(expected,MaximumProductOfTwoElement.maxProduct(array));

    }

    @Test
    public void testMaximumProductInArrayIs16(){
        int [] array = {1,5,4,5};
        int expected = 16;
        assertEquals(expected,MaximumProductOfTwoElement.maxProduct(array));

    }

    @Test
    public void testMaximumProductIs12InArray(){
        int [] array = {3,7};
        int expected = 12;
        assertEquals(expected,MaximumProductOfTwoElement.maxProduct(array));

    }

}