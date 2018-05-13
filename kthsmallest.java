public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(B, Collections.reverseOrder());
        for(int i = 0; i < A.size(); i++){
            if(queue.size() < B){
                queue.add(A.get(i));
            } else if(queue.peek() > A.get(i)){
                queue.poll();
                queue.add(A.get(i));
            }

        }

        return queue.poll();

    }
}