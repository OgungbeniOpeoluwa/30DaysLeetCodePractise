package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletTest {
    @Test
    public void getTheHighestAwardPointTest(){
        int [] alice = {1,2,3};
        int [] bob = {3,2,1};
        int [] awardPoint = {1,1};
        assertArrayEquals(awardPoint,CompareTheTriplet.compareTripletFFunction(alice,bob));
    }
    @Test
    public void getForAnotherHighestAwardPointTestBetweenAliceAndBob(){
        int [] alice = {5,6,7};
        int [] bob = {3,6,10};
        int [] awardPoint = {1,1};
        assertArrayEquals(awardPoint,CompareTheTriplet.compareTripletFFunction(alice,bob));
    }

}