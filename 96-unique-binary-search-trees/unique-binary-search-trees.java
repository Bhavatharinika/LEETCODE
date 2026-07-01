class Solution {
    public int numTrees(int n) {
       long sum = 1;

       for(int i =0;i<n;i++){
        sum = sum*(2*n-i);
        sum/=(i+1);
       }
       return (int) (sum/(n+1));
    }
}