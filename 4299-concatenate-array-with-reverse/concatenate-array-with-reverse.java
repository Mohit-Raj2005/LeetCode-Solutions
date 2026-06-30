class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];  // ans array of twice the length of the input array
        for(int i =0; i<n ; i++){
            ans[i] = nums[i];   // adding as it is from the front 
            ans[i+n] = nums[n-i-1];   // adding from the end 
        }
        return ans;
    }
}