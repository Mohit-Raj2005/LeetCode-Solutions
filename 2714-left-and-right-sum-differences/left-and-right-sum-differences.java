class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum = 0;
        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
        }
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] ans = new int[nums.length];
        leftsum[0] = 0;
        rightsum[nums.length - 1] = 0;
        for(int i = 1; i < nums.length; i++){
            leftsum[i] = leftsum[i-1] + nums[i - 1];
            rightsum[nums.length - 1 - i] = rightsum[nums.length - i] + nums[nums.length - i];
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return ans;
    }
}