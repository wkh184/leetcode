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
        LinkedHashMap<Integer, ArrayList> valueMap = new LinkedHashMap<Integer, ArrayList>();
        ListNode current = headA;
        ListNode intersection = null;
        while(current != null){
            if(valueMap.containsKey(Integer.valueOf(current.val))){
                ArrayList<ListNode> nodes = valueMap.get(Integer.valueOf(current.val));
                nodes.add(current);
                valueMap.put(Integer.valueOf(current.val), nodes);

            }else{
                ArrayList<ListNode> nodes = new ArrayList<ListNode>();
                nodes.add(current);
                valueMap.put(Integer.valueOf(current.val), nodes);
            }
            current = current.next;
        }
        current = headB;
        boolean match = false;
        while(current != null){
            if(valueMap.containsKey(Integer.valueOf(current.val))){
                ArrayList<ListNode> nodes = valueMap.get(Integer.valueOf(current.val));
                Iterator<ListNode> iterator = nodes.iterator();
                while(iterator.hasNext()){
                // intersection = valueMap.get(Integer.valueOf(current.val));
                intersection = iterator.next();
                if(listMatch(intersection, current)){
                    match = true;
                    break;
                }
            }
            if(match){
                break;
            }
            }
            current = current.next;            
        }       
        return intersection;
    }

    private boolean listMatch(ListNode listA, ListNode listB){
        if(listA == listB){
            if(listA.next == null || listB.next == null){
                return true;
            }else{
                return listMatch(listA.next, listB.next);
            }
        }else{
            return false;
        }
    }
}