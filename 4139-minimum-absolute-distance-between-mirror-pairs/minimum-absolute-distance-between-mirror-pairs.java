class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int mindis = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(map.containsKey(num)){
                mindis = Math.min(mindis,i-map.get(num));
            }
            int reverse = getreverse(num);
            map.put(reverse,i);
        }
        return mindis == Integer.MAX_VALUE?-1:mindis;
    }

    private int getreverse(int num){
        int rev = 0;
        while(num > 0){ 
        int digit = num%10;
        rev = rev*10+digit;
        num/=10;
        }
       return rev;
    }
}