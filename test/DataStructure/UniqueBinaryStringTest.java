package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinaryStringTest {
    @Test
    public void testForUniqueBinaryStringNumbersInArray(){
        String [] numbers = {"01","10"};
        String expected = "00";
        assertEquals(expected,UniqueBinaryString.binaryStringFunction(numbers));
    }
    @Test
    public void testForAnotherUniqueBinaryStringNumbersInArray(){
        String [] numbers = {"00","01"};
        String expected = "10";
        assertEquals(expected,UniqueBinaryString.binaryStringFunction(numbers));
    }
    @Test
    public void testForThirdUniqueBinaryStringNumbersInArray(){
        String [] numbers = {"111","011","001"};
        String expected = "000";
        assertEquals(expected,UniqueBinaryString.binaryStringFunction(numbers));
    }

}