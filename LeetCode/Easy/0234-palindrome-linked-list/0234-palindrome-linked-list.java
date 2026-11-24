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

        ListNode current = head;
        Stack<Integer> sk = new Stack<>();

        while(current!=null){
            sk.push(current.val);
            current = current.next;
        }

        while( head != null){
            if(sk.pop()!=head.val){
                return false;
            }
            head = head.next;
        }
        return true;
        
    }
}