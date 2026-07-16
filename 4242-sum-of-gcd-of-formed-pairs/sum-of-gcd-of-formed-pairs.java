class Solution {
    public long gcdSum(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int max = nums[0];
        for(int i =0;i<nums.length;i++){
            if(max <= nums[i]){
                max = nums[i];
            }
            int a = max;
            int b = nums[i];
            while(b != 0){
                int term = b;
                b = a%b;
                a = term;
            }
            list.add(a);
        }
        Collections.sort(list);
        int left = 0;
        int right = list.size()-1;

        long sum=0;

        while(left<right){
            int c = list.get(left);
            int d = list.get(right);
            while(d!=0){
                int reg = d;
                d=c%d;
                c=reg;
            }
            sum+=c;
            left++;
            right--;
        }
        return sum;
    }
}