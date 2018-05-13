public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int amt = (2 * A) - 1;
        ArrayList<ArrayList<Integer>> toReturn = new ArrayList<ArrayList<Integer>>();
        int startIdx = 0;

        for(int decrementAmt = A; decrementAmt > 0; decrementAmt--){
            for(int i = startIdx; i < amt; i++){
                ArrayList<Integer> aRow;
                if(toReturn.size() <= i){
                    aRow = new ArrayList<Integer>();
                } else {
                    aRow = toReturn.get(i);
                }


                for(int ii = startIdx; ii < amt; ii++){
                    if(ii >= aRow.size()){
                        aRow.add(decrementAmt);
                    } else {
                        aRow.set(ii, decrementAmt);
                    }
                }

                if(toReturn.size() <= i || toReturn.size() == 0){
                    toReturn.add(aRow);
                }
            }
            startIdx++;
            amt--;
        }
        return toReturn;
    }
}