/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
        ListNode runner = A.next;
        ListNode halfer = A;
        while(runner != null && runner.next != null && runner.next.next != null){
            runner = runner.next.next;
            halfer = halfer.next;
        }

        runner = A;
        //System.out.print(halfer.val + " ");

        halfer = halfer.next;
        ListNode mid = halfer;
        //System.out.print(halfer.val + " ");


        Deque<ListNode> stack = new ArrayDeque<ListNode>();

        while(halfer != null){

            stack.push(halfer);
            halfer = halfer.next;
        }

        // while(!stack.isEmpty()){
        while(runner != mid && mid != null){
            ListNode temp = stack.poll();
            runner.val = temp.val - runner.val;
            runner = runner.next;
        }



        //ListNode temp = new ListNode(halfer.val);
        // while(halfer != null){

        // }

        // ListNode mid = halfer;

        // while(halfer != null && runner != mid){
        //     runner.val = halfer.val - runner.val;
        //     runner = runner.next;
        //     halfer = halfer.next;
        // }

        // while(runner != null){
        //     if(runner.next != null && runner.next.next != null){
        //         runner = runner.next.next;
        //         halfer = halfer.next;
        //     } else {

        //     }
        // }
        return A;
    }
}
