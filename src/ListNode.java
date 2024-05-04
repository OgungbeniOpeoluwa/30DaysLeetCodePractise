import java.util.ArrayList;
import java.util.List;

public class ListNode {
    private int value;
    private ListNode next;
    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
    public  ListNode(int value){
        this.value = value;

    }
    public  ListNode(){}

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public static ListNode mapArray(int[] array){
        ListNode listNode = new ListNode(array[0]);
        ListNode temp = listNode;
        for(int count = 1; count < array.length;count++){
            ListNode nodes = new ListNode(array[count]);
            temp.next = nodes;
            temp = nodes;
        }
        return listNode;
    }

    public static boolean isPalindrome(ListNode node ) {
        List<Integer> value = new ArrayList<>();
        while (node.next != null){
            value.add(node.value);
            node = node.next;
        }
        value.add(node.value);
        List<Integer> reversed = value.reversed();
        for (int count = 0; count < reversed.size();count++){
            if(!value.get(count).equals(reversed.get(count)))return false;
        }
        return true;



    }
}
