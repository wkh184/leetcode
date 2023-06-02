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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = l1.val;
        int num2 = l2.val;
        int sum = num1 + num2;
        ListNode sumNode = new ListNode(sum % 10);
        sum = sum / 10;
        ListNode l1Current = l1.next;
        ListNode l2Current = l2.next;
        ListNode temp = sumNode;
        while(l1Current != null){
            num1 = l1Current.val;
            num2 = 0;
            if(l2Current != null){
                num2 = l2Current.val;
                l2Current = l2Current.next;
            }
            sum = sum + num1 + num2;
            ListNode newSumNode = new ListNode(sum % 10);
            temp.next = newSumNode;
            temp = newSumNode;
            sum = sum / 10;
            l1Current = l1Current.next;           
        }
        while(l2Current != null){
            num2 = l2Current.val;
            l2Current = l2Current.next;
            sum = sum + num2;
            ListNode newSumNode = new ListNode(sum % 10);
            temp.next = newSumNode;
            temp = newSumNode;
            sum = sum / 10;
        }
        if(sum != 0){
            ListNode newSumNode = new ListNode(sum % 10);
            temp.next = newSumNode;
            temp = newSumNode;           
        }
        return sumNode;
    }
}