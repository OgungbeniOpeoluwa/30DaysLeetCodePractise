import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomophicStringsTest {
    @Test
    public void testThatEggAndAddAreIsomophic(){
        String s = "egg";
        String t = "add";
        assertTrue(IsomophicStrings.returnIfStringIsIsomophic(s,t));
    }

    @Test
    public void testThatpaperAndTitleAreIsomophic(){
        String s = "Paper";
        String t = "Title";
        assertTrue(IsomophicStrings.returnIfStringIsIsomophic(s,t));
    }
    @Test
    public void testThatpaperAndTitleIsNotIsomophic(){
        String s = "Foo";
        String t = "Bar";
        assertFalse(IsomophicStrings.returnIfStringIsIsomophic(s,t));
    }
    @Test
    public void testThatabAndcodeIsIsomophic(){
        String s = "ab";
        String t = "\u0067\u0067";
        assertFalse(IsomophicStrings.returnIfStringIsIsomophic(s,t));
    }

}