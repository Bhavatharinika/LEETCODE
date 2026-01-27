class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;

        int a = 0;
        int b = 1;
        int term;

        for(int i =2;i<=n;i++){
            term = a+b;
            a=b;
            b=term;
        }
        return b;
    }
}