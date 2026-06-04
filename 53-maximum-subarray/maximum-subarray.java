// Solving this problem using Kadene's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0; //initialising sum variable with 0
        int maxsum= Integer.MIN_VALUE; //initialising maxsum with minimum value of integer
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];  // calculating sum till current iteration
            if(sum>maxsum){
                maxsum=sum;  //updating maxsum if the sum is greater than current sum
            }
            if(sum<0){
                sum=0; //making sum=0 if it is less -ve or bypassing the sum till previous interation because carrying the -ve sum will elentually decrease the sum value 
            }
        }  
        return maxsum;
    }
}