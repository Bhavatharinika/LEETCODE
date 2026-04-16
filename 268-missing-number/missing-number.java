class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int ev = n*(n+1)/2;

        int o = 0;
        for(int num:nums){
            o+=num;
        }
        return ev - o;
    }
}