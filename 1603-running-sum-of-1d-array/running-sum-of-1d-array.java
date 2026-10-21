class Solution {
    public int[] runningSum(int[] nums) {
        int[] copy = new int[nums.length];
        copy[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            copy[i] = nums[i] + copy[i - 1];
        }
        return copy;
    }
}