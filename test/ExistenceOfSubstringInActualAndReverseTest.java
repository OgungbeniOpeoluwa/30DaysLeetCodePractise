import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistenceOfSubstringInActualAndReverseTest {
    @Test
    public void testThatSubstringExistInLeetcodeReverse(){
        String value = "leetcode";
        assertTrue(ExistenceOfSubstringInActualAndReverse.checkIfSubstringExist(value));
    }
    @Test
    public void testThatSubstringExistInAbcbaReverse(){
        String value = "abcba";
        assertTrue(ExistenceOfSubstringInActualAndReverse.checkIfSubstringExist(value));
    }
    @Test
    public void testThatSubstringExistInAbcdReverse(){
        String value = "abcdc";
        assertTrue(ExistenceOfSubstringInActualAndReverse.checkIfSubstringExist(value));
    }

}