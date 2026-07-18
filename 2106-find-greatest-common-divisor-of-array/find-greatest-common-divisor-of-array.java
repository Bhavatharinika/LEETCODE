class Solution {
    public int findGCD(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>a){
                a=nums[i];
            }
           }
           for(int i = 1;i<nums.length;i++){
            if(nums[i]<b){
                b=nums[i];
            }
           }

        while(b>0){
            int term = b;
            b = a% b;
            a = term;
        }
        return a;
        }
    }
