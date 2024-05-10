import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNodeFromLinkedListTest {
    @Test
    public void removeNodeWhichHasGreaterValueAtTheRight(){
        int [] array = {5,2,13,3,8};
        ListNode node = ListNode.mapArray(array);
        int [] arrays = {13,8};
        assertEquals(arrays,RemoveNodeFromLinkedList.removeNodes(node));

    }

    @Test
    public void noNodeRemoveNoGreaterValueAtTheRight(){
        int [] array = {1,1,1,1,1};
        ListNode node = ListNode.mapArray(array);
        int [] arrays = {13,8};
        assertEquals(arrays,RemoveNodeFromLinkedList.removeNodes(node));
    }

}