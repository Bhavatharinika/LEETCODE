class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int cur = 0;
        int prev = 0;

        for(int x:nums){
            int temp = cur;
            cur = Math.max(prev+x,cur);
            prev = temp;
        }
        return cur;
    }
}