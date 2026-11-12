class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ansIncreasing = Integer.MIN_VALUE;
        int ansDecreasing = Integer.MIN_VALUE;
        int countIncreasing = 0;  
        int countDecreasing = 0;
        //increasing ans selection loop
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                countIncreasing++;
                ansIncreasing = Math.max(ansIncreasing, countIncreasing + 1);
            }
            else{
                countIncreasing = 0;
            }
        }


        // decreasing ans selection loop
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > nums[i]){
                countDecreasing++;
                ansDecreasing = Math.max(ansDecreasing, countDecreasing + 1);
            }
            else{
                countDecreasing = 0;
            }
        }
        //handling case when all the values are equal
        if(ansIncreasing == Integer.MIN_VALUE && ansDecreasing == Integer.MIN_VALUE){
            return 1;
        }
        // System.out.println(ansIncreasing);   //Debugging
        // System.out.println(ansDecreasing);
        return Math.max(ansIncreasing, ansDecreasing);
    }
}