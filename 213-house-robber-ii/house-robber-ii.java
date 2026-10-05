class Solution {
    static int rober(int index, int[] nums, int[] memo) {
        if (index >= nums.length) {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int includeIndex = nums[index] + rober(index + 2, nums, memo);
        int excludeIndex = rober(index + 1, nums, memo);
        int ans = Math.max(includeIndex, excludeIndex);
        memo[index] = ans;
        return ans;
    }

    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] memo1 = new int[nums.length];
        int[] memo2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memo1[i] = -1;
            memo2[i] = -1;
        }
        int[] arr2 = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            arr2[i] = nums[i];
        }
        int money1 = rober(0, arr2, memo1);
        int money2 = rober(1, nums, memo2);
        return Math.max(money1, money2);
    }
}