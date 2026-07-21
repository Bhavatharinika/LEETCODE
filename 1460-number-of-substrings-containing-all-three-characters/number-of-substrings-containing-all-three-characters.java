class Solution {
    public int numberOfSubstrings(String s) {
        int atA = -1;
        int atB = -1;
        int atC = -1;

        int count = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='a') atA = i;
            else if(ch=='b') atB = i;
            else if(ch=='c') atC = i;

            if(atA!=-1 && atB!=-1 && atC!=-1){
                count+= Math.min(atA,Math.min(atB,atC))+1;
                
            }
        }
        return count;
    }
}