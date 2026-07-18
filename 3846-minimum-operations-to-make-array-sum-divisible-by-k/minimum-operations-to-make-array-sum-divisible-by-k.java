class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum += nums[i];                     // calculating the sum of nums
        }
        return sum % k;                         // this would be the minimum operations to make the sum divisible by k
    }
}