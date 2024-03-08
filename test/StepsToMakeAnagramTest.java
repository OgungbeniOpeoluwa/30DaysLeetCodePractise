import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsToMakeAnagramTest {
    @Test
    public void testForMinimumNumberOfStepToMakeAnagram(){
        String value1 = "bab";
        String value2 =  "aba";
        assertEquals(1,StepsToMakeAnagram.getMinimumStepsOfAnagram(value1,value2));
    }

}