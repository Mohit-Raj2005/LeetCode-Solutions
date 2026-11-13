class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        
        //if removal from left side only
        int leftRemoval = Math.max(minIndex, maxIndex) + 1;

        //if removal is from right side only
        int rightRemoval = nums.length - Math.min(minIndex, maxIndex);

        //if removal is done from both the sides simultaneously
        int bothRemoval = Math.min(minIndex, maxIndex) + 1 + (nums.length - Math.max(minIndex, maxIndex));

        if(bothRemoval <= leftRemoval && bothRemoval <= rightRemoval){
            return bothRemoval;
        }
        else{
            return Math.min(leftRemoval, rightRemoval);
        }
    }
}