class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length ; i++){
            ans += Math.abs(nums[nums.length / 2] - nums[i]);
        }
        return ans;
    }
}
// in this solution we will sort the array and find the median and then add the absolute difference of each element and the median element to the answer 