class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>result=new ArrayList<>();
        for(int n:nums){
            String str = String.valueOf(n);
            for(int i = 0;i<str.length();i++){
                result.add(str.charAt(i)-'0');
            }
        }
        int[] res = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            res[i] = result.get(i);
        }
        return res;
    }
}