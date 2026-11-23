class Solution {
    public int triangularSum(int[] nums) {
        int count = 0;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else {
            while (count < n) {
                for (int i = 0; i <= n - 2 - count; i++) {
                    int temp = (nums[i] + nums[i + 1]) % 10;
                    nums[i] = temp;
                }
                count++;
            }
        }
        return nums[0];
    }
}