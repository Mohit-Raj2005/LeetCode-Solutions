// class Solution {
//     public int minOperations(int[] nums, int k) {
//         int sum = 0;
//         for(int i=0; i<nums.length ; i++){
//             sum += nums[i];                     // calculating the sum of nums
//         }
//         return sum % k;                         // this would be the minimum operations to make the sum divisible by k
//     }
// }

// we may use for each loop to calculate the sum to make it more optimised
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
         for(int num : nums){   // this is a similar solution but using for each loop to make it more optimised 
            sum += num;
         }
         return sum % k;
    }
}