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

    public ListNode addTwoNumsHelper(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }

        int sum = carry;

        if(l1 != null){
            sum+= l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            sum += l2.val;
            l2 = l2.next;
        }

        ListNode node = new ListNode(sum % 10);
        node.next = addTwoNumsHelper(l1, l2, sum / 10);
        return node;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return addTwoNumsHelper(l1, l2, 0);
        
    }
}