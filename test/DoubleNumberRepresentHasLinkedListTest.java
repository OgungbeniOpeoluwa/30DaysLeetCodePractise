import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleNumberRepresentHasLinkedListTest {
    @Test
    public void return378HasResultToTheLinkLIstDouble(){
        int [] array = {1,8,9};
        int [] expected = {3,7,8};
        ListNode node = ListNode.mapArray(array);
        ListNode expectedNode = ListNode.mapArray(expected);
        assertEquals(expectedNode,DoubleNumberRepresentHasLinkedList.doubleIt(node));
    }
    @Test
    public void returnDoubleLinkListTest(){
        int [] array = {3,4,5,4,2,5,5,9,9,9};
        int [] expected = {3,7,8};
        ListNode node = ListNode.mapArray(array);
        ListNode expectedNode = ListNode.mapArray(expected);
        assertEquals(expectedNode,DoubleNumberRepresentHasLinkedList.doubleIt(node));
    }

}