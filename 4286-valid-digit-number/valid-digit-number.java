class Solution {
    public boolean validDigit(int n, int x) {
        String num = Integer.toString(n);
        char ch = (char)(x+'0');

        if(num.charAt(0)==ch) return false;

        for(int i =1 ;i<num.length();i++){
            if(num.charAt(i)==ch) return true;
        }
        return false;
    }
}