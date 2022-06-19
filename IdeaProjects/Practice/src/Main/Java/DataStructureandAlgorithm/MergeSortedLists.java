package Main.Java.DataStructureandAlgorithm;

import java.util.PriorityQueue;
import java.util.Queue;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MergeSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
            Queue<ListNode> priorityQueue = new PriorityQueue<>((a, b) -> a.val - b.val);

            for(ListNode node : lists) {
                if(node==null) continue;
                priorityQueue.add(node);
            }

            ListNode dummy = new ListNode();
            ListNode current = dummy;

            while(!priorityQueue.isEmpty()) {
                ListNode first = priorityQueue.poll();
                current.next = first;
                current = current.next;

                if(first.next != null) {
                    priorityQueue.add(first.next);
                }
            }
            return dummy.next;

    }
}
