class Solution {
    public int thirdMax(int[] nums) {
       long max = Long.MIN_VALUE;
       long sm = Long.MIN_VALUE;
       long tm = Long.MIN_VALUE;

       for(int n : nums){
        long val = n;

        if(val==max||val==sm||val==tm) continue;

        if(val>max){
            tm=sm;
            sm=max;
            max=val;
        }
        else if(val>sm){
            tm=sm;
            sm=val;
        }
        else if(val>tm){
            tm = val;
        }
       }

       return tm==Long.MIN_VALUE?(int)max:(int)tm;
    }
}