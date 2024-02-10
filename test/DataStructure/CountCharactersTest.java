package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountCharactersTest {
    @Test
    public void testThatEachCharactersAreCountedAndReturnInAMap(){
        String input = "semicolon.africa";
        HashMap<Character,Integer> expected = new HashMap<>();
        expected.put('s',1);
        expected.put('e',1);
        expected.put('m',1);
        expected.put('i',2);
        expected.put('c',2);
        expected.put('o',2);
        expected.put('l',1);
        expected.put('n',1);
        expected.put('.',1);
        expected.put('a',2);
        expected.put('f',1);
        expected.put('r',1);
        assertEquals(expected,CountCharacters.returnCharacterMapped(input));
    }
    @Test
    public void testThatPearsCharactersAreCountedAndReturnInAMap(){
        String input = "pears";
        HashMap<Character,Integer> expected = new HashMap<>();
        expected.put('p',1);
        expected.put('e',1);
        expected.put('a',1);
        expected.put('r',1);
        expected.put('s',1);
        assertEquals(expected,CountCharacters.returnCharacterMapped(input));
    }

}