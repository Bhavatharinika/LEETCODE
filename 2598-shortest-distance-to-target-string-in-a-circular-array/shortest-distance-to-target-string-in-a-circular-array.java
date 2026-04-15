class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int mindis = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(words[i].equals(target)){
                int dif = Math.abs(i-startIndex);
                int dis = Math.min(dif,n-dif);
                mindis = Math.min(mindis,dis);
            }
        }
        return mindis == Integer.MAX_VALUE?-1:mindis;
    }
}