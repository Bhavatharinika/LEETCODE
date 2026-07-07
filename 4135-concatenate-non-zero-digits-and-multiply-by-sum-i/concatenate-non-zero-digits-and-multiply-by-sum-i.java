class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);

        long sum = 0;
        long st = 0;

        for(char c : s.toCharArray()){
            if(c!='0'){
                int dig = c-'0';
                st = st*10 + dig;
                sum+=dig;
            }
        }
        return st *sum;
    }
}