public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public void setNext(ListNode node){
        this.next = node;
    }

    public void getList(ListNode node){
        while (node != null){
            System.out.print(node.val);
            node = node.next;
            if(node != null){
                System.out.print("->");
            }
        }
    }
}
