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
            // set both Pointers to head
            ListNode fast = head;
            ListNode slow = head;

            //Fast travel 2x speed than slow, so when slow at middle, fast will reach the end
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            //Slow = mid point - we need to reset pointer slow
            // Example: 1 2 3 3 2 1 and Slow is at 3
            // Make slow reverse like 1 2 3 - 1 2 3 (slow) at second 1
            // Fast point back to head which is 1
            slow = reversed(slow);
            fast = head;

            // When reversed slow pointer isn't null
            while (slow!=null){
                //we loop through the List to check their value
                // 1 2 3 1 2 3 
                // Fast  Slow => 123 vs 123 
                if(slow.val!=fast.val){
                    return false;
                }
                //Loop through the rest til slow is null
                slow = slow.next;
                fast = fast.next;
            }

            //If all condition passed, it's palindrome
            return true;
        }

    //Reverse function to reverse slow pointer
    public ListNode reversed(ListNode node){
        //Set prev = null 
        ListNode prev = null;
        
        //When slow pointer isn't null, reverse
        while (node != null){
            // Example:
            // 3 2 1 => node = 3 and 3.next is 2
            ListNode next = node.next;
            
            // 3 -> null
            node.next = prev;
            // prev = 3
            prev = node;
            // node pointer = 2
            node = next;
        }
        return prev;
    }
}
