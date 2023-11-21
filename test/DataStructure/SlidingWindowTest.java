package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {
    @Test
    public void testMaxSlidingWindow(){
        int [] number = {1,3,-1,-3,5,3,6,7} ;
        int key = 3;
        int [] expected = {3,3,5,5,6,7};
        assertArrayEquals(expected,SlidingWindow.getTheMaxSlidingWindowInKey(number,key));
    }
    @Test
    public void testAnotherMaxSlidingWindow(){
        int [] number = {1} ;
        int key = 1;
        int [] expected = {1};
        assertArrayEquals(expected,SlidingWindow.getTheMaxSlidingWindowInKey(number,key));
    }


}