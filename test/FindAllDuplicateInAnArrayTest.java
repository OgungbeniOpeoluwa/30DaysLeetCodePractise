import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicateInAnArrayTest {
    @Test
    public void returnDuplicateArray(){
        int [] array ={4,3,2,7,8,2,3,1};
        List<Integer> expected = List.of(2,3);
        assertEquals(expected,FindAllDuplicateInAnArray.findDuplicates(array));
    }

}