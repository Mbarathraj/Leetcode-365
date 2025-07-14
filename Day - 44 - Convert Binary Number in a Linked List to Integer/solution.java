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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0;
        int tot=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=count-1;i>=0;i--){
            if(temp.val==1){
                tot+=(int) Math.pow(2,i);
            }
            temp=temp.next;
        }
        return tot;
        
    }
}
