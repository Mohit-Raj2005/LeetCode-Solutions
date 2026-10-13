class Solution {
    public long maxAlternatingSum(int[] nums) {
        // int[] nums2 = new int[nums.length];
        long score = 0;
        for(int i = 0; i < nums.length; i++){
            // score += (nums[i] * nums[i]);
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        // System.out.println(score);
        // System.out.println(Arrays.toString(nums2));
        for(int i = 0; i < nums.length / 2; i++){
            score -= (nums[i] * nums[i]);
        }
        for(int i = nums.length / 2 ; i < nums.length; i++){
            score += (nums[i] * nums[i]);
        }
        return score;
    }
}