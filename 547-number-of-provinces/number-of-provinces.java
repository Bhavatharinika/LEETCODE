class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[]visited = new boolean[n];

        int pro = 0;
        for(int i =0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                pro++;
            }
        }
        return pro;
    }

    public void dfs(int cur,int[][] isConnected,boolean[]visited){
        visited[cur]=true;
        for(int i =0;i<isConnected.length;i++){
        if(isConnected[cur][i]==1 && !visited[i]){
            dfs(i,isConnected,visited);
           }
        }
    }
}