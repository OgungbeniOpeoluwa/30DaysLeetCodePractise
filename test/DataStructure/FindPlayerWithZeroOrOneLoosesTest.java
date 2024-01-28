package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindPlayerWithZeroOrOneLoosesTest {
    @Test
    public void testThatWhenPlayersThatWinsAndLostAmathIsGivenITReturnsPLayersThatNeverLostAndThoseThatLostOnces(){
        int [] []matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        int [] [] expected = {{1,2,10},{4,5,7,8}};
        System.out.println(Arrays.deepToString(FindPlayerWithZeroOrOneLooses.returnPlayersWithOneLostAndZeroLost(matches)));
        assertArrayEquals(expected,FindPlayerWithZeroOrOneLooses.returnPlayersWithOneLostAndZeroLost(matches));
        }
        @Test
    public void anotherTestCase(){
            int [] [] matches = {{2,3},{1,3},{5,4},{6,4}};
            int [] [] expected = {{1,2,5,6},{}};
            assertArrayEquals(expected,FindPlayerWithZeroOrOneLooses.returnPlayersWithOneLostAndZeroLost(matches));
        }

}