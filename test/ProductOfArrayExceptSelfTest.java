import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    public void productOfAllInTheArrayAreReturnTest(){
        int [] array = {1,2,3,4};
        int [] arrayReturn = {24,12,8,6};
        assertArrayEquals(arrayReturn,ProductOfArrayExceptSelf.returnProductInArray(array));
    }

    @Test
    public void productOfAllInTheArrayAreReturn2Test(){
        int [] array = {-1,1,0,-3,3};
        int [] arrayReturn ={0,0,9,0,0};
        assertArrayEquals(arrayReturn,ProductOfArrayExceptSelf.returnProductInArray(array));
    }

    @Test
    public void productOfAllInTheArrayAreReturn3Test(){
        int [] array = {0,4,0};
        int [] arrayReturn ={0,0,0};
        assertArrayEquals(arrayReturn,ProductOfArrayExceptSelf.returnProductInArray(array));
    }


}