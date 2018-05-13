public class Solution {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int ans = 0;
        int winLength = A.size();
        while(winLength >= 1){
            for(int i = 0; i + winLength <= A.size(); i++){
                int sum = 0;
                for(int checker = i; checker < i + winLength; checker++){
                    if(sum > C){
                        break;
                    }
                    sum += A.get(checker);
                }
                if(sum >= B && sum <= C){
                    ans++;
                }
            }
            winLength--;
        }
        return ans;
    }
}