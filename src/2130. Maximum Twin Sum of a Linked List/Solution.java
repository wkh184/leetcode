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
    public int pairSum(ListNode head) {
        int listLen = 0;
        Stack<Integer> values = new Stack<Integer>();
        ListNode current = head;
        while(current != null){
            listLen += 1;
            values.push(Integer.valueOf(current.val));
            current = current.next;
        }
        current = head;
        int pairSum = 0;
        for(int i = 0; i < listLen / 2; i++){
            int newSum = current.val + values.pop().intValue();
            if(newSum > pairSum){
               pairSum = newSum; 
            }
            current = current.next;
        }
        return pairSum;
    }
}