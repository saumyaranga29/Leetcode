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
        ArrayList<Integer> ar = new ArrayList<>();
        while(head != null){
            ar.add(head.val);
            head = head.next;
        }
        int left = 0, right = ar.size()-1;
        while(left< right){
            if(ar.get(left) != ar.get(right)){
                return false;
            }
            left ++;
            right --;

        }
        return true;
    }
}