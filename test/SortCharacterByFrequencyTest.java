import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharacterByFrequencyTest {
    @Test
    public void testThatTheHighestCharacterAppearFirstInString(){
        String input = "tree";
        String expected ="eetr";
        assertEquals(expected,SortCharacterByFrequency.returnStringBasedOnFrequencyCharacter(input));
    }
    @Test
    public void testThatTheHighestCharacterAppearFirstInAnotherString(){
        String input = "cccaaa";
        String expected = "cccaaa";
        assertEquals(expected,SortCharacterByFrequency.returnStringBasedOnFrequencyCharacter(input));
    }

    @Test
    public void testThatTheHighestCharacterAppearFirstInAString(){
        String input ="abaccadeeefaafcc";
        String expected = "aaaaacccceeeffdb";
        assertEquals(expected,SortCharacterByFrequency.returnStringBasedOnFrequencyCharacter(input));
    }

}