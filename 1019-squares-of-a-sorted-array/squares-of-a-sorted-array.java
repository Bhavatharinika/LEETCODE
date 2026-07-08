class Solution {
    public int[] sortedSquares(int[] nums) {
        //Arrays.sort(nums);
        int n = nums.length;
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        return arr;
    }
}