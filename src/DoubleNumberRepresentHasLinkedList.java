public class DoubleNumberRepresentHasLinkedList {

    public static ListNode doubleIt(ListNode node) {
        String value ="";
        while(node.next != null){
            value+=String.valueOf(node.value);
            node = node.next;
        }
        value+=node.value;
        System.out.println(value);
        Integer numb = Integer.parseInt(value)*2;
        System.out.println(numb);
        value = String.valueOf(numb);
        ListNode nodes = new ListNode(Integer.parseInt(String.valueOf(value.charAt(0)+"")));
        ListNode temp = nodes;
        for(int count=1;count<value.length();count++){
            int val = Integer.parseInt(value.charAt(count)+"");
            ListNode newNode = new ListNode(val);
            temp.next = newNode;
            temp = newNode;

        }
        return nodes;
    }

}
