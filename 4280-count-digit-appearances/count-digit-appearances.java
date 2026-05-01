class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String num = Arrays.toString(nums);
        char ch = (char)(digit+'0');

        int count = 0;
        for(int i = 0;i<num.length()-1;i++){
            if(num.charAt(i)== ch){
                count++;
            }
        }
        return count;
    }
}