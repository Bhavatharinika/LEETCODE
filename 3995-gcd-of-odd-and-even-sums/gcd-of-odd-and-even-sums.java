class Solution {
    public int gcdOfOddEvenSums(int n) {
       int a = n*n;
       int b = n*(n+1);

       while(b>0){
        int term = b;
        b = a%b;
        a = term;
       }
       return a;
    }
}