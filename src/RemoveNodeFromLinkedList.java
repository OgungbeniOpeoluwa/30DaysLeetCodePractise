public class RemoveNodeFromLinkedList {

    public static ListNode removeNodes(ListNode node) {
        if(!checkIfValueHasGreaterValue(node))return node;
        if(node.next != null) {
            node = checkIfNodeIsLesser(node);
            node.value = node.next.value;
            node.next = node.next.next;
            removeNodes(node);
        }

        return node;
    }
    public static ListNode checkIfNodeIsLesser(ListNode node){
        if(node.value < node.next.value) return node;
        return node.next;
    }
    public static boolean checkIfValueHasGreaterValue(ListNode node){
        while (node.next != null){
            if(node.next.value > node.value)return true;
            node = node.next;
        }
        return false;
    }
}
