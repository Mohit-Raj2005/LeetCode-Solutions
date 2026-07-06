class Solution {
    //========THIS IS METHOD 2============
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0, doubleDigitSum = 0;  // variables to store sum 
        for(int digit : nums){  // for each digit in nums
            if(digit < 10){   // if it is a single digit 
                singleDigitSum += digit;  
            }
            else{      // else if it is a double digit
                doubleDigitSum += digit;
            }
        }
        if(singleDigitSum == doubleDigitSum){   // if both singleDigitSum and doubleDigitSum are equal then alice loses
            return false;
        }
        return true; //Alice wins if the sum of all single-digit numbers and the sum of all double-digit numbers are different.  || HINT ||
    }

    //===========THIS IS METHOD 1============= 
    // public boolean canAliceWin(int[] nums) {
    //     int singleDigitSum = 0;  // initialising the variable to store the sum of single digits
    //     int doubleDigitSum = 0;  // initialising the variable to store the sum of single digits
    //     for(int i = 0; i <nums.length ; i++){   // iterating nums 
    //         if(Integer.toString(nums[i]).length() == 1){   // checking for integers having single digit in the nums variable
    //             singleDigitSum = singleDigitSum + nums[i];
    //         }
    //         else{
    //            doubleDigitSum = doubleDigitSum + nums[i];
    //         }
    //     }
    //     if(doubleDigitSum != singleDigitSum){  // checking if singleDigitSum and doubleDigitSum are not equal
    //         return true;
    //     }
    //     return false;
    // }
}