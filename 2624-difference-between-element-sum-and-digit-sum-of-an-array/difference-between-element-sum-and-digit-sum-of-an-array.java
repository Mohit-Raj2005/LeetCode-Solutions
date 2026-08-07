class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i = 0; i<nums.length ; i++){
            elementSum += nums[i];
            int temp = nums[i];
            int tempsum = 0;
            while(temp>0){
                int last = temp % 10;
                tempsum += last;
                temp = temp / 10;
            }
            digitSum += tempsum;
        }
        return Math.abs(elementSum - digitSum);
    }
}