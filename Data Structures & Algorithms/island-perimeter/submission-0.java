class Solution {

    int[][] grid;
    boolean[][] visited;
    int rows; int cols;
    int res;

    public int islandPerimeter(int[][] grid) {
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.grid = grid;
        this.visited = new boolean[rows][cols];
        this.res = 0;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 1) return dfs(i,j);
            }
        }
        return 0;
    }


        int dfs(int i, int j) {
            if(i>=rows || j>= cols || i<0 || j<0 || grid[i][j]==0) return 1;
            if(visited[i][j]) return 0;
            visited[i][j] = true;

            return dfs(i+1,j) + dfs(i-1,j) + dfs(i,j+1) + dfs(i,j-1);

        
    }
}