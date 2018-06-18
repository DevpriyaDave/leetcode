package LinkedList;

/**
 * Created by devpriyadave on 4/26/18.
 */
public class DeleteNodeInLL {
    public void deleteNode(ListNode node) {
        ListNode previous = node;
            while(node != null) {
                if(node.next == null) {
                   previous.next = null;
                    return;
                }
                node.val = node.next.val;
                previous = node;
                node = node.next;

            }

    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

}
