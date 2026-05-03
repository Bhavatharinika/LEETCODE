class Solution {
    public int[] countOppositeParity(int[] nums) {
        int odd = 0;
        int even = 0;
        int n = nums.length;
        int [] arr = new int[n];
       for(int i =0;i<n;i++){
        if(nums[i]%2==0) even++;
        else  odd++;
       }
       for(int i =0;i<n;i++){
        if(nums[i]%2==0) even--;
        else  odd--;        
     
        if(nums[i]%2==0) arr[i]= odd;
        else  arr[i]=even;        
       
    }
    return arr;
    }
}