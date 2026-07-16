class Solution {
    public int numberOfChild(int n, int k) {
        int child = 2*(n-1);
        k %= child;

        if(k<=n-1) return k;
        else return child - k;
    }
}