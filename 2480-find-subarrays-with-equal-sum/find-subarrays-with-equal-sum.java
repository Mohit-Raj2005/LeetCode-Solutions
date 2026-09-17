class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++){
            int pairSum = nums[i] + nums[i+1];
            if(set.contains(pairSum)){
                return true;
            }
            set.add(pairSum);
        }
        return false;
    }
}
// 