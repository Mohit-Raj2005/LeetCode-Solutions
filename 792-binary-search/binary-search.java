class Solution {
    public int search(int[] nums, int target) {
        int low = 0;   //starting index
        int high = nums.length-1;   //ending index
        while(low <= high){
        //    int mid = (low + high)/2;     this condition for calculation of mid is also valid but it can break if the mid ends up to a value greater than the range of an index
        int mid = low + (high - low)/2; //by using this expression for the evaluation of mid will handle the edge case of overflow, overflow will not happen if we use this expression
            if(nums[mid]==target){
                return mid;
            }
            else{   
                if(nums[mid]<target){
                    low = mid + 1;    //moving towards right
                }
                else{
                    high = mid -1;  // moving towards left
                }
            }
            
        }
        return -1;
    }
}