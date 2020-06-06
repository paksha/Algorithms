// Longest Increasing Path in a Matrix
// classic DFS problem
class Solution {
    private static final int dir[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    private int R = 0, C = 0;
    private int cache[][];
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        R = matrix.length;
        C = matrix[0].length;
        cache = new int[R][C];
        int maxLen = 1;
        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                maxLen = Math.max(maxLen, helper(matrix, i, j));
            }
        }
        return maxLen;
    }
    
    private int helper(int[][] matrix, int r, int c) {
        if (cache[r][c] > 0) return cache[r][c];
        int maxLen = 1;
        for (int[] dirs : dir) {
            int newR = r + dirs[0];
            int newC = c + dirs[1];
            if (newR < 0 || newR == R || newC < 0 || newC == C || 
               matrix[newR][newC] <= matrix[r][c]) continue;
            maxLen = Math.max(maxLen, helper(matrix, newR, newC) + 1);
        }
        cache[r][c] = maxLen;
        return maxLen;
    }
}