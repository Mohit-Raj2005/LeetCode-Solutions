class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length >= 3) {
            return nums[1];
            // or we can also return nums[nums.length - 2]
        } else {
            return -1;
        }

        //this is another solution that we can have to solve this poblem 
        // if (nums.length < 3) {
        //     return -1;
        // }
        // return nums[1];

    }
}