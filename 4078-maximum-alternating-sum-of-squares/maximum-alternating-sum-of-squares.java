class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] nums2 = new int[nums.length];
        long score = 0;
        for(int i = 0; i < nums.length; i++){
            // score += (nums[i] * nums[i]);
            nums2[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums2);
        // System.out.println(score);
        // System.out.println(Arrays.toString(nums2));
        for(int i = 0; i < nums.length / 2; i++){
            score -= (nums2[i] * nums2[i]);
        }
        for(int i = nums.length / 2 ; i < nums.length; i++){
            score += (nums2[i] * nums2[i]);
        }
        return score;
    }
}