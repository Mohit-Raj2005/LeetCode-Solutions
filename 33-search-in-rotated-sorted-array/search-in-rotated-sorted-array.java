class Solution {
    // This is the binary search approach for this problem
        public int search(int[] nums, int target) {
            int start = 0;   // initialising the start variable
            int end = nums.length-1;  // initialising the end variable
            int ans = -1;        // initialising the ans with -1 
            while(start <= end){
                int mid = start + (end - start)/2;  // applying binary search 
                if(target == nums[mid]){
                    return mid;     // checking if the mid element is the target element
                }
                else if(nums[mid]>=nums[start]){    // checking if we are in the   ordered array or the first half 
                    if(target >=nums[start] && nums[mid]>target){    // checking if the target lies in the first half or checking if the target is smaller than the mid AND greater than start element
                        end = mid -1;    //moving left to look for the target 
                    }
                    else{
                        start = mid +1;   // if the target element is lesser than the start element or terget element is greater than the mid element
                    }
                }
                else{   // if we are in the 2nd half of the array 
                    if(target<=nums[end] && target>nums[mid]){   // checking if the target lies in this 2nd array i.e, target is smaller than the end AND greater than the mid element
                        start = mid +1;   // moving right to look for the target
                    }
                    else{
                        end = mid -1;  // if our target is smaller than the end element AND also smaller than the mid element
                        // moving left
                    }
                }
            }
            return ans;
        }

    //this is linear search method but we want to do it by using binary search method
    // public int search(int[] nums, int target) {
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}