class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length ; i++){
            int tempsum = 0;
            for(int j = Math.max(0, i - nums[i]); j <= i ; j++){
                tempsum += nums[j];
            }
            ans += tempsum;
        }
        return ans;
    }
}