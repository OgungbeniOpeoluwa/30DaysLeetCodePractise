import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {
    @Test
    public void delete5inLinkedNode(){
        int [] array = {4,5,1,9};
        ListNode node = ListNode.mapArray(array).getNext();
         DeleteNode.deleteNode(node);
    }

}