/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            // 2 Nodes traveling down the list,
            // if the fast node hit the end of the list - No cycle - return false
            // if slow node and fast node hits each other - cycle - return true
            if(head == null){
                return false;
            }
        
            ListNode fastNode = head.next;
            ListNode slowNode = head;

            //Keep looping til
            // fastNode hit the end
            // or they on the same node
            while ( slowNode != fastNode){

                if(fastNode == null || fastNode.next == null){
                    return false; // Reach the end
                }
                
                fastNode = fastNode.next.next;
                slowNode = slowNode.next;
            }
            //if fastNode == slowNode - cycle
            return true;
    }
}
