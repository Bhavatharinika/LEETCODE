class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] ans = new int[n-k+1];

        int index = 0;
        Deque<Integer>dq=new LinkedList<>();

        for(int right =0;right<n;right++){

            while(!dq.isEmpty()&& dq.peekFirst()<=right-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[right]){
                dq.pollLast();
            }

            dq.offerLast(right);

            if(right>=k-1){
                ans[index++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}