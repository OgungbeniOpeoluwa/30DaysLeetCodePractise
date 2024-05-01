import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrenceTest {
    @Test
    public void testThatArrayHasUniqueNumberOfOccurrence(){
        int [] array = {1,2,2,1,1,3};
        boolean result = UniqueNumberOfOccurrence.uniqueOccurrence(array);
        assertTrue(result);
    }

}