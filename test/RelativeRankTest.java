import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeRankTest {
    @Test
    public void returnPositionInRankingOrder(){
        int [] array = {5,4,3,2,1};
        String [] expected = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        assertArrayEquals(expected,RelativeRank.findRelativeRank(array));
    }

}