public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        if(A == null){
            return 0;
        }
        if(A.size() == 1){
            return 1;
        }
        int maxStreak = 0;
        HashSet<Integer> mySet = new HashSet<Integer>();
        for(int entry : A){
            mySet.add(entry);
        }

        for(int entry : mySet){
            if(!mySet.contains(entry - 1)){
                int localMax = 1;
                int curEntryVal = entry;
                while(mySet.contains(curEntryVal + 1)){
                    localMax++;
                    curEntryVal++;
                }
                if(maxStreak < localMax){
                    maxStreak = localMax;
                }

            }
        }
        return maxStreak;
    }
}
