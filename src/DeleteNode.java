import java.util.ArrayList;
import java.util.List;

public class DeleteNode {





    public static void deleteNode(ListNode node){
        node.value = node.next.value;
        node.next = node.next.next;
    }

}
