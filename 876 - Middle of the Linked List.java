class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast!=null && fast.next !=null && fast.next.next != null){
            fast= fast.next.next;
            slow = slow.next;
        }
        
        if(fast.next != null){
            slow = slow.next;
        }
        
        return slow;
    }
}