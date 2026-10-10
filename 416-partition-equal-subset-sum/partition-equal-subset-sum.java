class Solution {
    static boolean PossibleOrNot(int targetSum, int index, int[] nums,Boolean[][]dp) {
        if (targetSum == 0) {
            return true;
        }
        if (index >= nums.length && targetSum != 0) {
            return false;
        }
        if(targetSum < 0){
            return false;
        }
        if(dp[index][targetSum] != null){
            return dp[index][targetSum];
        }
        boolean choose = PossibleOrNot(targetSum - nums[index], index + 1, nums, dp);
        boolean notChoose = PossibleOrNot(targetSum, index + 1, nums, dp);
        dp[index][targetSum] = (choose || notChoose);
        return  dp[index][targetSum];
    }

    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int targetSum = totalSum / 2;
        Boolean[][]dp = new Boolean[nums.length + 1][targetSum + 1];
        if (totalSum % 2 != 0) {
            return false;
        } else {
            return PossibleOrNot(targetSum, 0, nums,dp);
        }
    }
}
