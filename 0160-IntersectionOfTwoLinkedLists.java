/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if either head is null, then it's just null
        if(headA == null || headB == null) return null;
        
        //Set pointer to both head and construct the listnode A B together
        //Idea:
        // 5 4 3 2 1 -> 5 4 3 2 1 2 6 2 1 
        // 2 6 2 1 ->   2 6 2 1 5 4 3 2 1 
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        //While pointers didn't point to interesect
        while(pointerA != pointerB){
            
            //Construct A + B
            if(pointerA == null){
                pointerA = headB;
            } else {
                pointerA = pointerA.next;
            }
            
            //Construct B + A
            if(pointerB == null){
                pointerB = headA;
            } else {
                pointerB = pointerB.next;
            }
        }
        
        //Return the interesect ADDRESS return in pointerA
        //Note Address index, NOT VALUE OF NODE!
        return pointerA;
    }
}
