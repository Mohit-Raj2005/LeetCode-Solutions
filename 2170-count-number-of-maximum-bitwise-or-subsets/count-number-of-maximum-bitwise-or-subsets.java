class Solution {
    static int solve(int index, int[] nums, int currentOr, int maxBitwiseOr) {
        if (index >= nums.length) {
            if (currentOr == maxBitwiseOr) {
                return 1;

            } else {
                return 0;
            }
        }

        // choose the current element
        int take = solve(index + 1, nums, (int) (currentOr | nums[index]), maxBitwiseOr);

        //skip the element
        int notTake = solve(index + 1, nums, currentOr, maxBitwiseOr);

        return take + notTake;
    }

    public int countMaxOrSubsets(int[] nums) {
        int index = 0;
        int maxBitwiseOr = 0;
        for (int i = 0; i < nums.length; i++) {
            maxBitwiseOr = (int) (maxBitwiseOr | nums[i]);
        }
        int count = 0;
        int currentOr = 0;
        count = solve(index, nums, currentOr, maxBitwiseOr);
        return count;
    }
}