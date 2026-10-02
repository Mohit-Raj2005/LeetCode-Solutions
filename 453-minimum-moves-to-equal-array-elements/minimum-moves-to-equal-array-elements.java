class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i < nums.length; i++){
            if(nums[i] <= min){
                min = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            ans += Math.abs(min - nums[i]);
        }
        return ans;
    }
}