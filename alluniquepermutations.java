public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        if(A == null){
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> toReturn = new ArrayList<ArrayList<Integer>>();
        toReturn.add(new ArrayList<Integer>());
        for(int cur = 0; cur < A.size(); cur++){
            HashSet<ArrayList<Integer>> setItr = new HashSet<ArrayList<Integer>>();
            for(ArrayList<Integer> anExistingList : toReturn){
                for(int anIdx = 0; anIdx < 1 + anExistingList.size(); anIdx++){
                    anExistingList.add(anIdx, A.get(cur));
                    ArrayList<Integer> temp = new ArrayList<Integer>(anExistingList);
                    anExistingList.remove(anIdx);
                    setItr.add(temp);
                }
            }
            toReturn = new ArrayList<ArrayList<Integer>>(setItr);
        }
        return toReturn;
    }
}
