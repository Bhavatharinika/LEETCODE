class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";

        while(columnNumber>0){
            int pos = (columnNumber-1)%26;
            ans = (char)('A'+pos)+ans;
            columnNumber=(columnNumber-1)/26;
        }
        return ans;
    }
}