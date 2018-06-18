package BlankOut;

/**
 * Created by devpriyadave on 5/2/18.
 */
public class ReverseLL {
    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return head;
        }
        ListNode previousNode = null;
        ListNode nextNode = head;
        while(nextNode!=null) {
            head = nextNode;
            head.next = previousNode;
            previousNode = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
}

