class Solution {
    private int[][] visited;
    private int n;
    private int m;
    
    public int numIslands(char[][] grid) {
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        visited = new int[n][m];
        int count = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[i][c] == '1') {
                    DFSMark(grid, i, c);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void DFSMark(char[][] grid, int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] != '1') return;
        grid[r][c] = '0';
        DFSMark(grid, r+1, c);
        DFSMark(grid, r-1, c);
        DFSMark(grid, r, c+1);
        DFSMark(grid, r, c-1);
    }
}