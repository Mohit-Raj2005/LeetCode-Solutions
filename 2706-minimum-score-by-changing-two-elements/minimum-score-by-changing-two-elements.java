class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);

        // when changing first two elements so the minimum difference becomes 0 thus range becomes from index 2 to (n - 1)
        int firstMin = nums[nums.length - 1] - nums[2]; // checking the minimum value of the maximum difference 

        // when changing the last 2 elements so that the minimum difference becomes 0 and range becomes 0 to (n - 2)
        int secondMin = nums[nums.length - 3] - nums[0];
        // checking the value of maximum absolute difference in the range 0 to (n - 3)

        int thirdMin = nums[nums.length - 2] - nums[1];
        return Math.min(Math.min(firstMin, secondMin) , thirdMin);

        // return Math.min(Math.min((nums[nums.length -1 ] - nums[2]),(nums[nums.length - 3] - nums[0])),(nums[nums.length - 2] - nums[1]));

    }
}