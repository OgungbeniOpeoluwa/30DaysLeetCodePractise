import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    @Test
    public void linkedListPanlidromIsTrueTest(){
        int [] array = {1,2,2,1};
        ListNode node = ListNode.mapArray(array);
        boolean expected = ListNode.isPalindrome(node);
        assertTrue(expected);
    }

    @Test
    public void linkedListPanlidromIsFalseTest(){
        int [] array = {1,2};
        ListNode node = ListNode.mapArray(array);
        boolean expected = ListNode.isPalindrome(node);
        assertFalse(expected);
    }


}