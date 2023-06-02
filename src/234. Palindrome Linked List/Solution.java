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
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverse = new Stack<Integer>();
        boolean palindrome = true;
        ListNode traverse = head;
        while(traverse.next != null){
            reverse.push(Integer.valueOf(traverse.val));
            traverse = traverse.next;
        }
        reverse.push(Integer.valueOf(traverse.val));
        traverse = head;
        while(traverse.next != null){
            if(traverse.val != reverse.pop().intValue()){
                palindrome = false;
                break;
            }
            traverse = traverse.next;
        }
        if(traverse.val != reverse.pop().intValue()){
            palindrome = false;
        }      
        return palindrome;
    }
}