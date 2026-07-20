class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int tot = m*n;
        k%=tot;

        int[][]ans = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                int ind = i*n+j;
                int newind = (ind+k)%tot;

                int x = newind/n;
                int y = newind%n;
                ans[x][y]=grid[i][j];
            }
        }

        List<List<Integer>>res = new ArrayList<>();

        for(int i = 0;i<m;i++){
            List<Integer>row = new ArrayList<>();
            for(int j = 0;j<n;j++){
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}