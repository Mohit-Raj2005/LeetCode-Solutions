class Solution {
    // separate function to check whether the split is valid or not
    static boolean isValid(int[] nums, int k, int maxlength){
        int sum = 0;    // sum variable to store / compare the sum of the split subarray
        int splitcount = 1;   // split count initialised with 1
        for(int i = 0; i< nums.length; i++){  // iterating through the nums array to split and calculate the sum of the split subarray
            if(sum + nums[i] <= maxlength){   // checking if the sum + nums[i] is less than the maxlength or the mid element passed 
                sum += nums[i];
            }
            else{
                splitcount++;   // if it is not valid, we will increase the split count and calculate sum from further iteration 
                if( splitcount > k || nums[i] > maxlength ){    // if the split count increases total input splits in the question, then returning false
                    return false;
                }
                else{
                    // otherwise calculating sum for the next split subarray
                    sum = 0;
                    sum += nums[i];
                }
            }

        }
        return true;   // if the control comes out of the loop means it is a valid split and it will return true
    }
    public int splitArray(int[] nums, int k) {
        int maxsum = 0;   // initialising maxsum 
        for(int i = 0; i<nums.length; i++){
            maxsum += nums[i];   // adding all the values of nums to calculate the total sum
        }
        int start = 0;   // the range of cost will be from 0 to maxsum
        int end = maxsum;   // end of the range 
        int ans = -1;    // variable to store the final answer
        while(start <= end){
            int mid = start + (end - start)/2;     // applying binary search to find the mid of the range
            if(isValid(nums , k , mid)){// checking if the mid number in the range can be the valid ans or not
                ans = mid;      // if it can be a valid answer, we will store it 
                end = mid - 1;  // and move towards left to find if any other smaller valid answer in the range
            }
            else{
                start = mid + 1;    // if it is not a valid answer then we will move towards right to look for the valid answer
            }
        }
        return ans;  // finally we will be returning the ans
    }
}