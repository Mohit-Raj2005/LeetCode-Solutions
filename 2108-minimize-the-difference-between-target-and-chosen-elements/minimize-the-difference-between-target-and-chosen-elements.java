class Solution {
    static int solve(int[][] mat, int target, int accumulatedSum, int row, int[][]dp) {
        if (row >= mat.length) {
            return Math.abs(target - accumulatedSum);
        }
        if(dp[row][accumulatedSum] != -1){
            return dp[row][accumulatedSum];
        }
        int ans = Integer.MAX_VALUE;
        for (int c = 0; c < mat[0].length; c++) {
            int newSum = accumulatedSum + mat[row][c];
            int next = solve(mat, target, newSum, row + 1,dp);
            ans = Math.min(ans, next);
        }
        dp[row][accumulatedSum] = ans;
        // return ans;
        return dp[row][accumulatedSum];
    }

    public int minimizeTheDifference(int[][] mat, int target) {
        int accumulatedSum = 0;
        int[][] dp = new int[mat.length ][4901];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(mat, target, accumulatedSum, 0,dp);
    }
}