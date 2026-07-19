class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[]n:accounts){
            int cur = 0;
            for(int m : n){
                cur+=m;
            }
            max = Math.max(max,cur);
        }
        return max;
    }
}