class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;  // initialising the variable to store the sum of single digits
        int doubleDigitSum = 0;  // initialising the variable to store the sum of single digits
        for(int i = 0; i <nums.length ; i++){   // iterating nums 
            if(Integer.toString(nums[i]).length() == 1){   // checking for integers having single digit in the nums variable
                singleDigitSum = singleDigitSum + nums[i];
            }
            else{
               doubleDigitSum = doubleDigitSum + nums[i];
            }
        }
        if(doubleDigitSum != singleDigitSum){  // checking if singleDigitSum and doubleDigitSum are not equal
            return true;
        }
        return false;
    }
}