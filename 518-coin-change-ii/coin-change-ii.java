class Solution {
    static int countCombination(int index, int amount,int[] coins,int n,int[][]dp){
        
        if(amount == 0){
            return 1;
        }
        if(amount > 0 && index == n){
            return 0;
        }
        if(amount < 0){
            return 0;
        }
        if(dp[index][amount] != -1){
            return dp[index][amount];
        }

        int take = countCombination(index, amount - coins[index] , coins,n,dp);
        int notTake = countCombination(index + 1 , amount, coins,n,dp);
        dp[index][amount] = take + notTake;
        return dp[index][amount];
    } 
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][]dp = new int[n+1][amount+1];
        for(int i = 0; i <= n ; i++){
            for(int j = 0; j <= amount;j++){
                dp[i][j] = -1;
            }
        }
        int ans = countCombination(0,amount,coins,n,dp);
        return ans;
    }
}