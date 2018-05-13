public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++){
            int cur = A.get(i);
            // int nextMax = Integer.MAX_VALUE;
            int nextMax = -1;
            for(int ii = i + 1; ii < A.size(); ii++){
                int candidate = A.get(ii);
                if(candidate > cur){
                    nextMax = candidate;
                    break;
                }
            }
            // if(nextMax == Integer.MAX_VALUE){
            //     nextMax = -1;
            // }
            ret.add(nextMax);
        }
        return ret;
    }
}
