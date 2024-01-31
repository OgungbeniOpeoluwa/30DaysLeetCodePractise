package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HcfTest {
    @Test
    public void returnTheHcfOf8412Test(){
        int [] input = {8,12};
        int [] expected ={2,2};
        assertArrayEquals(expected,Hcf.returnTheHcf(input));
    }
    @Test
    public void returnTheHcfOf639Test(){
        int [] input = {9,18,9};
        int [] expected ={3,3};
        assertArrayEquals(expected,Hcf.returnTheHcf(input));
    }

}