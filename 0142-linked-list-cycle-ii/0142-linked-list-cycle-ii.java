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
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hs=new HashSet<>();
        ListNode curr=head;
        while(curr!=null) {
            if(hs.contains(curr)) return curr;
            hs.add(curr);
            curr=curr.next;
        }
        return null;
    }
}