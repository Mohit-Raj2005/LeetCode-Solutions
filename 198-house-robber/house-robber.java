class Solution {
    static int rober(int index, int[] nums,int[] memo) {
        if (index >= nums.length) {
            return 0;
        }
        int currentVal = nums[index];
        
        if(memo[index] != -1){
            return memo[index];
        }
        int a = currentVal + rober(index + 2, nums, memo);
        int b = rober(index + 1, nums,memo);
        int ans = Math.max(a, b);
        memo[index] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        for(int j = 0; j < nums.length;j++){
            memo[j] = -1;
        }
        return rober(0, nums,memo);
    }
}