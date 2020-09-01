/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            slow = reversed(slow);
            fast = head;

            while (slow!=null){
                if(slow.val!=fast.val){
                    return false;
                }
                slow = slow.next;
                fast = fast.next;
            }

            return true;
        }

    public ListNode reversed(ListNode node){
        ListNode prev = null;
        while (node != null){
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
