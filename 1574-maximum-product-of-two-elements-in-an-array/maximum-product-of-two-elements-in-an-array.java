class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if((nums[i] - 1) * (nums[j] - 1) >= max){
        //             max = (nums[i] - 1) * (nums[j] - 1);
        //         }
        //     }
        // }
        // return max;
    }
}