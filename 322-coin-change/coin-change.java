class Solution {
    static int minCount(int index, int amount, int[] coins, int n, int[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (index >= n && amount > 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[index][amount] != 0) {
            return dp[index][amount];
        }

        int take = minCount(index, amount - coins[index], coins, n, dp);
        int notTake = minCount(index + 1, amount, coins, n, dp);
        if (take != Integer.MAX_VALUE) {
            take += 1;
        }
        // return Math.min(take,notTake) ;
        dp[index][amount] = Math.min(take, notTake);
        return dp[index][amount];

    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        int ans = minCount(0, amount, coins, n, dp);
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        return ans;
    }
}