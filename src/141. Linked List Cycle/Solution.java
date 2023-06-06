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
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        ArrayList<ListNode> nodes = new ArrayList<ListNode>(); 
        boolean hasCycle= true;
        while(current != null){
            if(nodes.contains(current)){
                // node encountered before, exit traversing
                break;
            }else{
                nodes.add(current);
            }
            current = current.next;
        }
        // if can traverse to last node, current node will be node
        if(current == null){
            hasCycle = false;
        }
        return hasCycle;
    }
}