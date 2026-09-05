class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stableIndex = -1;
        int[] prefixMax = new int[nums.length];
        int[] suffixMin = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            prefixMax[i] = max;
        }
        for(int j = nums.length - 1; j >= 0; j--){
            min = Math.min(min, nums[j]);
            suffixMin[j] = min;
        }
        for(int m = 0; m<nums.length; m++){
            if(prefixMax[m] - suffixMin[m] <= k){
                 stableIndex = m;
                return stableIndex;
            }
        }
        return stableIndex;
    }
}