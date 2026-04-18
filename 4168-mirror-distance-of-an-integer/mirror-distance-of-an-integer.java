class Solution {
    public int mirrorDistance(int n) {
        int or = n;
        int rev = 0;

        while(n>0){
            int dig = n%10;
            rev = rev*10+dig;
            n/=10;
        }
        return Math.abs(rev - or);
    }
}