//Idea:
//Compare both List
//Put the smaller value into list move pointer to next element
//Keep comparing and put next smallest into list and keep going
//Til no more element in one list, then add the reminding element to the list

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //Set up new list to put in element from L1 and L2
            ListNode newList = new ListNode(-1);

            //Pointer to head of newList
            ListNode head = newList;

            //Keep comparing element from both list til one list is null
            while(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    //if L1 value is smaller
                    newList.next = l1;
                    //Move pointer in L1 to it's next element
                    l1 = l1.next;
                } else {
                    //if L2 value is smaller
                    newList.next = l2;
                    //Move pointer in L2 to it's next element
                    l2 = l2.next;
                }
                //Move next list forward to next node in order for new node come in from lists
                newList = newList.next;
            }

            //Append the rest of L1 or L2 into newList
            if(l1 != null){
                newList.next = l1;
            } else {
                newList.next = l2;
            }

            //Return Pointer of new List, head is current pointed to -1
            return head.next;
    }
}
