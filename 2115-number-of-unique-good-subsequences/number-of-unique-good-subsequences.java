class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        long MOD = 1000000007;
        long zero = 0;
        long one = 0;
        boolean haszero =false;
        for(char ch : binary.toCharArray()){
            if(ch=='1'){
                one = (one+zero+1)%MOD;
            }
            else{
                haszero = true;
                zero = (zero+one)%MOD;
            }
        }
        return (int)((one+zero+(haszero ? 1:0))%MOD);
    }
}