class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        List<Integer>list=new ArrayList<>();
        int zero = 0;
        int one = 0;

        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
                if(ch =='0') zero++;
                else{
                    one++;
                    if(zero>0){
                        list.add(zero);
                        zero=0;
                    }
                }
        }

        if(zero>0) list.add(zero);
        if(list.isEmpty()) return one;

        int max = 0;
        for(int i =0;i<list.size()-1;i++){
            int len = list.get(i)+list.get(i+1);
            max=Math.max(max,len);
        }
        return max+one;
    }
}