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
        Set<ListNode> hs=new HashSet<>();
        ListNode curr=headA;
        while(curr!=null){
            hs.add(curr);
            curr=curr.next;
        }
        ListNode cur=headB;
        while(cur!=null){
            if(hs.contains(cur)) return cur;
            hs.add(cur);
            cur=cur.next;
        }
        return null;
    }
}